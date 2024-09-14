namespace _010_WebAppWithRepository.Models.Requests
{
    public class CreateConsultationRequest
    {
        public int ClientId { get; set; }
        public int PetID { get; set; }
        public DateTime ConsultationDate { get; set; }
        public string Description { get; set; }

    }
}
