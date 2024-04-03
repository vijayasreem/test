using System;
using System.Threading.Tasks;

public class DocumentVerificationService : IDocumentVerificationService
{
    public async Task VerifyDocument()
    {
        Console.WriteLine("Welcome to the Document Verification App!");

        Console.WriteLine("Please enter the applicant's identity:");
        string identity = await GetUserInput();

        Console.WriteLine("Please enter the applicant's address:");
        string address = await GetUserInput();

        if (VerifyIdentity(identity) && VerifyAddress(address))
        {
            Console.WriteLine("Document verification successful. The applicant is eligible for banking services.");
        }
        else
        {
            Console.WriteLine("Incomplete document verification. The applicant is not eligible for banking services.");
        }
    }

    private bool VerifyIdentity(string identity)
    {
        // Perform identity verification logic
        return !string.IsNullOrEmpty(identity);
    }

    private bool VerifyAddress(string address)
    {
        // Perform address verification logic
        return !string.IsNullOrEmpty(address);
    }

    private Task<string> GetUserInput()
    {
        return Task.Run(() => Console.ReadLine());
    }
}

public class CreditEvaluationService
{
    public async Task EvaluateCredit()
    {
        Console.WriteLine("Welcome to the Credit Evaluation App!");

        Console.WriteLine("Please enter the applicant's annual income:");
        decimal income = decimal.Parse(await GetUserInput());

        Console.WriteLine("Please enter the applicant's credit score:");
        int creditScore = int.Parse(await GetUserInput());

        if (income >= 30000 && creditScore >= 700)
        {
            Console.WriteLine("Congratulations! The applicant is eligible for a credit score with a high limit.");
        }
        else if (income >= 20000 && creditScore >= 600)
        {
            Console.WriteLine("The applicant is eligible for a credit score with a moderate limit.");
        }
        else
        {
            Console.WriteLine("The applicant is not eligible for a credit score.");
        }

        CloseResources();
    }

    private void CloseResources()
    {
        // Close any resources used, such as the Scanner
        Console.WriteLine("Closing resources...");
    }

    private Task<string> GetUserInput()
    {
        return Task.Run(() => Console.ReadLine());
    }
}

public class Program
{
    public static async Task Main(string[] args)
    {
        var documentVerificationService = new DocumentVerificationService();
        await documentVerificationService.VerifyDocument();

        var creditEvaluationService = new CreditEvaluationService();
        await creditEvaluationService.EvaluateCredit();

        Console.WriteLine("Press any key to exit...");
        Console.ReadKey();
    }
}