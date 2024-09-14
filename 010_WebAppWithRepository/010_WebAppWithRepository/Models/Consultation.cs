namespace _010_WebAppWithRepository.Models
{
    public class Consultation
    {
        //@"CREATE TABLE Consultations(ConsultationId INTEGER PRIMARY KEY,
        //        ClientId INTEGER,
        //        PetID INTEGER,
        //        ConsultationDate INTEGER,
        //        Description TEXT)";

        public int ConsultationId { get; set; }
        public int ClientId { get; set; }
        public int PetID { get; set; }
        public DateTime ConsultationDate { get; set; }
        public string Description { get; set; }



    }
}
