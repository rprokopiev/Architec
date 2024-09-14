using _010_WebAppWithRepository.Models.Requests;
using _010_WebAppWithRepository.Models;
using _010_WebAppWithRepository.Services;
using _010_WebAppWithRepository.Services.impl;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace _010_WebAppWithRepository.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ConsultationController : ControllerBase
    {
        private readonly IConsultationRepository _consultationRepository;

        public ConsultationController(IConsultationRepository consultationRepository)
        {
            _consultationRepository = consultationRepository;
        }

        [HttpPost("create")]
        public IActionResult Create([FromBody] CreateConsultationRequest createRequest)
        {
            int res = _consultationRepository.Create(new Consultation
            {
                ClientId = createRequest.ClientId,
                PetID = createRequest.PetID,
                ConsultationDate = createRequest.ConsultationDate,
                Description = createRequest.Description,
            });
            return Ok(res);
        }

        [HttpPut("update")]
        public IActionResult Update([FromBody] UpdateConsultationRequest updateRequest)
        {
            int res = _consultationRepository.Update(new Consultation
            {
                ConsultationId = updateRequest.ConsultationId,
                ClientId = updateRequest.ClientId,
                PetID = updateRequest.PetID,
                ConsultationDate = updateRequest.ConsultationDate,
                Description = updateRequest.Description,
            });
            return Ok(res);
        }

        [HttpDelete("delete")]
        public IActionResult Delete([FromBody] int consultationId)
        {
            int res = _consultationRepository.Delete(consultationId);
            return Ok(res);
        }

        [HttpGet("get-all")]
        public IActionResult GetAll()
        {
            return Ok(_consultationRepository.GetAll());
        }

        [HttpGet("get/{consultationId}")]
        public IActionResult GetById([FromRoute] int consultationId)
        {
            return Ok(_consultationRepository.GetById(consultationId));
        }
    }
}
