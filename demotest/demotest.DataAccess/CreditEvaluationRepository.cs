using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Threading.Tasks;

namespace demotest
{
    public class Repository<T> : IRepository<T>
    {
        private string _connectionString;

        public Repository(string connectionString)
        {
            _connectionString = connectionString;
        }

        public async Task<T> GetById(int id)
        {
            using (var connection = new MySqlConnection(_connectionString))
            {
                var sql = "SELECT * FROM " + typeof(T).Name + " WHERE Id = @Id";
                var parameters = new { Id = id };

                var result = await connection.QuerySingleOrDefaultAsync<T>(sql, parameters);
                return result;
            }
        }

        public async Task<IEnumerable<T>> GetAll()
        {
            using (var connection = new MySqlConnection(_connectionString))
            {
                var sql = "SELECT * FROM " + typeof(T).Name;

                var result = await connection.QueryAsync<T>(sql);
                return result;
            }
        }

        public async Task<int> Add(T entity)
        {
            using (var connection = new MySqlConnection(_connectionString))
            {
                var sql = "INSERT INTO " + typeof(T).Name + " VALUES (@Id, @WelcomeMessage, @IdentityInput, @AddressInput, @SuccessMessage, @IncompleteVerificationMessage)";

                var result = await connection.ExecuteAsync(sql, entity);
                return result;
            }
        }

        public async Task<int> Update(T entity)
        {
            using (var connection = new MySqlConnection(_connectionString))
            {
                var sql = "UPDATE " + typeof(T).Name + " SET WelcomeMessage = @WelcomeMessage, IdentityInput = @IdentityInput, AddressInput = @AddressInput, SuccessMessage = @SuccessMessage, IncompleteVerificationMessage = @IncompleteVerificationMessage WHERE Id = @Id";

                var result = await connection.ExecuteAsync(sql, entity);
                return result;
            }
        }

        public async Task<int> Delete(int id)
        {
            using (var connection = new MySqlConnection(_connectionString))
            {
                var sql = "DELETE FROM " + typeof(T).Name + " WHERE Id = @Id";
                var parameters = new { Id = id };

                var result = await connection.ExecuteAsync(sql, parameters);
                return result;
            }
        }
    }

    public class DocumentVerificationRepository : IRepository<DocumentVerificationModel>
    {
        private Repository<DocumentVerificationModel> _repository;

        public DocumentVerificationRepository(string connectionString)
        {
            _repository = new Repository<DocumentVerificationModel>(connectionString);
        }

        public async Task<DocumentVerificationModel> GetById(int id)
        {
            return await _repository.GetById(id);
        }

        public async Task<IEnumerable<DocumentVerificationModel>> GetAll()
        {
            return await _repository.GetAll();
        }

        public async Task<int> Add(DocumentVerificationModel entity)
        {
            return await _repository.Add(entity);
        }

        public async Task<int> Update(DocumentVerificationModel entity)
        {
            return await _repository.Update(entity);
        }

        public async Task<int> Delete(int id)
        {
            return await _repository.Delete(id);
        }
    }

    public class CreditEvaluationRepository : IRepository<CreditEvaluationModel>
    {
        private Repository<CreditEvaluationModel> _repository;

        public CreditEvaluationRepository(string connectionString)
        {
            _repository = new Repository<CreditEvaluationModel>(connectionString);
        }

        public async Task<CreditEvaluationModel> GetById(int id)
        {
            return await _repository.GetById(id);
        }

        public async Task<IEnumerable<CreditEvaluationModel>> GetAll()
        {
            return await _repository.GetAll();
        }

        public async Task<int> Add(CreditEvaluationModel entity)
        {
            return await _repository.Add(entity);
        }

        public async Task<int> Update(CreditEvaluationModel entity)
        {
            return await _repository.Update(entity);
        }

        public async Task<int> Delete(int id)
        {
            return await _repository.Delete(id);
        }
    }
}