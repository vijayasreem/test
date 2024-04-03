


using demotest.DTO;
using demotest.Service;
using Microsoft.AspNetCore.Mvc;
using System.Threading.Tasks;

namespace demotest.API
{
    [ApiController]
    [Route("api/[controller]")]
    public class DocumentVerificationController : ControllerBase
    {
        private readonly IDocumentVerificationService _documentVerificationService;

        public DocumentVerificationController(IDocumentVerificationService documentVerificationService)
        {
            _documentVerificationService = documentVerificationService;
        }

        [HttpPost]
        public async Task<IActionResult> VerifyDocument([FromBody] DocumentVerificationDto document)
        {
            await _documentVerificationService.VerifyDocument();

            if (document.IdentityVerified && document.AddressVerified)
            {
                return Ok("Document verification successful, eligible for banking services.");
            }
            else
            {
                return BadRequest("Incomplete document verification, ineligible for banking services.");
            }
        }
    }
}
