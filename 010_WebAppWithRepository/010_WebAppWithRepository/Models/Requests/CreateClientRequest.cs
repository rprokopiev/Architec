﻿namespace _010_WebAppWithRepository.Models.Requests
{
    public class CreateClientRequest
    {
        public string Document { get; set; }

        public string SurName { get; set; }

        public string FirstName { get; set; }

        public string Patronymic { get; set; }

        public DateTime Birthday { get; set; }

    }
}
