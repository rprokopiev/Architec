using _010_WebAppWithRepository.Controllers;
using _010_WebAppWithRepository.Models;
using _010_WebAppWithRepository.Models.Requests;
using _010_WebAppWithRepository.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _012_ClinicServiceTests
{
    public class ClientControllerTests
    {
        private ClientController _clientController;
        private Mock<IClientRepository> _mocClientRepository;

        public ClientControllerTests() 
        {
            _mocClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mocClientRepository.Object);
        }

        // Тестирование метода GetAll()
        #region
        [Fact]
        public void GetAllClientsTests()
        {
            // [1.1] Подготовка данных для тестирования

            List<Client> list = new List<Client>();
            list.Add(new Client());
            list.Add(new Client());
            list.Add(new Client());

            // [1.2] инициализация репозитория с тестовыми данными
            _mocClientRepository.Setup(repository =>
                repository.GetAll()).Returns(list);

            // [2] Инициализация тестируемого метода
            var operationResult = _clientController.GetAll();

            // [3] Подготовка эталонного рез-та, проверка результата
                // Тест что получен ответ HTTP 200:
            Assert.IsType<OkObjectResult>(operationResult.Result);
                
                // Тест, что получен список нужных клиентов 
            Assert.IsAssignableFrom<List<Client>>(((OkObjectResult)operationResult.Result).Value);

                // Тест, что клиенты получены из репозитория (методом GetAll())
            _mocClientRepository.Verify(repository =>
                repository.GetAll(), Times.AtLeastOnce());

        }
        #endregion

        // Тестирование метода Create()
        #region
        // Подготовка данных для тестирования метода с входящими данными:
        public static readonly object[][] CorrectCreateClientData =
        {
            new object[] { new DateTime(1985, 5, 20), "123 1234", "Ivanov", "Ivan", "Ivanovich"},
            new object[] { new DateTime(1986, 6, 21), "123 2222", "Ivanov", "Ivan", "Ivanovich"},
            new object[] { new DateTime(1987, 7, 22), "123 3333", "Ivanov", "Ivan", "Ivanovich"},
        };

        [Theory]// тестриования с входящими данными:
        [MemberData(nameof(CorrectCreateClientData))] // возращает данные из 1.1., аргумент - строковое имя переменной или через nameof 
        public void CreateClientTest(DateTime birthdate, string document, string surName, string firstName, string patronymic)
        {
            // [1.2] Инициализация тестируемого метода репозитория 
            _mocClientRepository.Setup(repository =>
                repository
                    .Create(It.IsNotNull<Client>()))    //Создание клиента
                    .Returns(1)                     //Возвращаемый результат 1
                    .Verifiable();                  //Проверка если передан данные выше (объект и результат), ошибка, если нет.

            var operationResult = _clientController.Create(new CreateClientRequest
            {
                Birthday = birthdate,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic
            });

            // Тест, что возвращает объект ОК    
            Assert.IsType<OkObjectResult>(operationResult.Result);
            
            // Тест, что возвращает объект int
            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);

            //тест на работы с репозиторием
            _mocClientRepository.Verify(repository =>
                repository.Create(It.IsNotNull<Client>()), Times.AtLeastOnce());
        }
        #endregion

        
        /* Тестирование метода ClientGetAllById() */
        #region
        [Theory]
        [InlineData(1)]
        [InlineData(2)]
        [InlineData(3)]
        public void ClientGetAllByIdTest(int clientId)
        {
            Client client = new()
            {
                Birthday = new DateTime(1985, 5, 20),
                Document = "123 1234",
                ClientId = clientId,
                FirstName = "Ivan",
                Patronymic = "Ivanovich",
                SurName = "Ivanov",
            };

            _mocClientRepository.Setup(repository =>
                repository.GetById(clientId)).Returns(client).Verifiable();

            var operationResult = _clientController.GetById(clientId);

            Assert.IsType<OkObjectResult>(operationResult.Result);

            Assert.IsAssignableFrom<Client>(((OkObjectResult)operationResult.Result).Value);

            _mocClientRepository.Verify(repository =>
                repository.GetById(clientId), Times.AtLeastOnce());
        }
        #endregion

        
        /* Тестированием метода Update()*/
        #region
        public static readonly object[][] CorrectCreateUpdateData =
        {
            new object[] { 1, new DateTime(1985, 5, 20), "123 1234", "Ivanov", "Ivan", "Ivanovich"},
            new object[] { 2, new DateTime(1986, 6, 21), "123 2222", "Ivanov", "Ivan", "Ivanovich"},
            new object[] { 3, new DateTime(1987, 7, 22), "123 3333", "Ivanov", "Ivan", "Ivanovich"},
        };
        [Theory]
        [MemberData(nameof(CorrectCreateUpdateData))]
        public void UpdateClientTest(int clientId, DateTime birthdate, string document, string surName, string firstName, string patronymic)
        {
            Client client = new()
            {
                Birthday = birthdate,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic,
                ClientId = clientId
            };

            _mocClientRepository.Setup(repository =>
                repository.Update(It.IsNotNull<Client>())).Returns(1).Verifiable();

            var operationResult = _clientController.Update(new UpdateClientRequest
            {
                ClientId = clientId,
                Birthday = birthdate,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic
            });

            Assert.IsType<OkObjectResult>(operationResult.Result);

            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);

            _mocClientRepository.Verify(repository =>
                repository.Update(It.IsNotNull<Client>()), Times.AtLeastOnce());
        }
        #endregion


        /* Тестированием метода Delete()*/
        #region
        [Theory]
        [InlineData(1)]
        [InlineData(2)]
        [InlineData(3)]
        public void ClientDeleteTest(int clientId)
        {
            Client client = new()
            {
                Birthday = new DateTime(1985, 5, 20),
                Document = "123 1234",
                ClientId = clientId,
                FirstName = "Ivan",
                Patronymic = "Ivanovich",
                SurName = "Ivanov",
            };

            _mocClientRepository.Setup(repository =>
                repository.Delete(clientId)).Returns(1).Verifiable();

            var operationResult = _clientController.Delete(clientId);

            Assert.IsType<OkObjectResult>(operationResult.Result);

            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);

            _mocClientRepository.Verify(repository =>
                repository.Delete(clientId), Times.AtLeastOnce());
        }
        #endregion

    }
}
