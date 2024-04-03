namespace demotest
{
    public class DocumentVerificationModel
    {
        public int Id { get; set; }
        public string WelcomeMessage { get; set; }
        public string IdentityInput { get; set; }
        public string AddressInput { get; set; }
        public string SuccessMessage { get; set; }
        public string IncompleteVerificationMessage { get; set; }
    }
    
    public class CreditEvaluationModel
    {
        public int Id { get; set; }
        public decimal AnnualIncome { get; set; }
        public int CreditScore { get; set; }
        public string CongratulatoryMessage { get; set; }
        public string ModerateLimitMessage { get; set; }
    }
}