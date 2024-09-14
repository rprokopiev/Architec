using _010_WebAppWithRepository.Models;

namespace _010_WebAppWithRepository.Services
{
    public interface IRepository<T, TId>
    {
        /// T, TId - обобщение, позволяет применять к разным классам и типам

        int Create(T item);
        /// int -   когда такие методы работают с БД, в ответ приходит тип INT
        ///         1, если метод сработал, 0 - нет.  
        
        int Update(T item);
        int Delete(TId id);
        T GetById(TId id);
        List<T> GetAll();

    }
}
