using System.Xml.Linq;

namespace _010_WebAppWithRepository.Models
{
    public class Pet
    {
        /// <summary>
        /// ClientId INTEGER, Name TEXT, Birthday INTEGER
        /// </summary>
        public int PetId { get; set; }

        public int ClientId { get; set; }

        public string Name { get; set; }

        public DateTime Birthday { get; set; }



    }
}
