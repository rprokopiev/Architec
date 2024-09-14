using _010_WebAppWithRepository.Models;

namespace _010_WebAppWithRepository.Services
{
    public interface IPetRepository : IRepository<Pet, int>
    {
    }
}
