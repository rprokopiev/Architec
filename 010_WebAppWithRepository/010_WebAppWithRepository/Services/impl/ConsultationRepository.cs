using _010_WebAppWithRepository.Models;
using Microsoft.Data.Sqlite;

namespace _010_WebAppWithRepository.Services.impl
{
    public class ConsultationRepository : IConsultationRepository
    {
        private const string connectionString = "Data Source = clinic.db;";

        public int Create(Consultation item)
        {
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "INSERT INTO consultations(ClientId, PetId, ConsultationDate, Description) VALUES(@ClientId, @PetId, @ConsultationDate, @Description)";
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@PetId", item.PetID);
                command.Parameters.AddWithValue("@ConsultationDate", item.ConsultationDate.Ticks);
                command.Parameters.AddWithValue("@Description", item.Description);
                // подготовка команды к выполнению
                command.Prepare();
                // выполнение команды
                return command.ExecuteNonQuery();
            }
        }

        public int Update(Consultation item)
        {
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "UPDATE consultations SET ClientId = @ClientId, PetId = @PetId, ConsultationDate = @ConsultationDate, Description = @Description WHERE ConsultationId=@ConsultationId";
                command.Parameters.AddWithValue("@ConsultationId", item.ConsultationId);
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@PetId", item.PetID);
                command.Parameters.AddWithValue("@ConsultationDate", item.ConsultationDate.Ticks);
                command.Parameters.AddWithValue("@Description", item.Description);
                // подготовка команды к выполнению
                command.Prepare();
                // выполнение команды
                return command.ExecuteNonQuery();
            }
        }

        public int Delete(int id)
        {
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "DELETE FROM consultations WHERE ConsultationId=@ConsultationId";
                command.Parameters.AddWithValue("@ConsultationId", id);
                // подготовка команды к выполнению
                command.Prepare();
                // выполнение команды
                return command.ExecuteNonQuery();
            }
        }

        public List<Consultation> GetAll()
        {
            List<Consultation> list = new List<Consultation>();
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "SELECT * FROM consultations";
                // выполнение команды
                SqliteDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    Consultation consultation = new Consultation
                    {
                        ConsultationId = reader.GetInt32(0),
                        ClientId = reader.GetInt32(1),
                        PetID = reader.GetInt32(2),
                        ConsultationDate = new DateTime(reader.GetInt64(3)),
                        Description = reader.GetString(4),
                    };
                    list.Add(consultation);
                }
            }
            return list;
        }

        public Consultation GetById(int id)
        {
            List<Consultation> list = new List<Consultation>();
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "SELECT * FROM consultations WHERE ConsultationId = @ConsultationId";
                command.Parameters.AddWithValue("@ConsultationId", id);
                command.Prepare();
                // выполнение команды
                SqliteDataReader reader = command.ExecuteReader();
                if (reader.Read())
                {
                    Consultation consultation = new Consultation
                    {
                        ConsultationId = reader.GetInt32(0),
                        ClientId = reader.GetInt32(1),
                        PetID = reader.GetInt32(2),
                        ConsultationDate = new DateTime(reader.GetInt64(3)),
                        Description = reader.GetString(4),
                    };
                    return consultation;
                }
            }
            return null;
        }
    }
}
