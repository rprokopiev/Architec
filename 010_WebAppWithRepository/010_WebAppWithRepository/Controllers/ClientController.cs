﻿using _010_WebAppWithRepository.Models;
using _010_WebAppWithRepository.Models.Requests;
using _010_WebAppWithRepository.Services;
using _010_WebAppWithRepository.Services.impl;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using System.Reflection.PortableExecutable;

namespace _010_WebAppWithRepository.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ClientController : ControllerBase
    {
        private readonly IClientRepository _clientRepository;

        public ClientController(IClientRepository clientRepository)
        {
            _clientRepository = clientRepository;
        }

        [HttpPost("create")]
        [SwaggerOperation(OperationId = "ClientCreate")]
        public ActionResult<int> Create([FromBody] CreateClientRequest createRequest)
        {
            int res = _clientRepository.Create(new Client
            {
                Document = createRequest.Document,
                SurName = createRequest.SurName,
                FirstName = createRequest.FirstName,
                Patronymic = createRequest.Patronymic,
                Birthday = createRequest.Birthday,
            });
            return Ok(res);
        }

        [HttpPut("update")]
        [SwaggerOperation(OperationId = "ClientUpdate")]
        public ActionResult<int> Update([FromBody] UpdateClientRequest updateRequest)
        {
            int res = _clientRepository.Update(new Client
            {
                ClientId = updateRequest.ClientId,
                Document = updateRequest.Document,
                SurName = updateRequest.SurName,
                FirstName = updateRequest.FirstName,
                Patronymic = updateRequest.Patronymic,
                Birthday = updateRequest.Birthday,
            });
            return Ok(res);
        }

        [HttpDelete("delete")]
        [SwaggerOperation(OperationId = "ClientDelete")]
        public ActionResult<int> Delete([FromBody] int clientId)
        {
            int res = _clientRepository.Delete(clientId);
            return Ok(res);
        }

        [HttpGet("get-all")]
        [SwaggerOperation(OperationId = "ClientGetAll")]
        public ActionResult<List<Client>> GetAll ()
        {
            return Ok(_clientRepository.GetAll());
        }

        [HttpGet("get/{clientId}")]
        [SwaggerOperation(OperationId = "ClientGetAllById")]
        public ActionResult<Client> GetById ([FromRoute] int clientId)
        {
            return Ok(_clientRepository.GetById(clientId));
        }
    }
}
