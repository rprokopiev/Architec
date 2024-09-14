using _010_WebAppWithRepository.Models;
using Microsoft.Data.Sqlite;

namespace _010_WebAppWithRepository.Services.impl
{
    public class PetRepository : IPetRepository
    {
        private const string connectionString = "Data Source = clinic.db;";

        public int Create(Pet item)
        {
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "INSERT INTO pets(ClientId, Name, Birthday) VALUES(@ClientId, @Name, @Birthday)";
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@Name", item.Name);
                command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
                // подготовка команды к выполнению
                command.Prepare();
                // выполнение команды
                return command.ExecuteNonQuery();
            }
        }

        public int Update(Pet item)
        {
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "UPDATE pets SET ClientId = @ClientId, Name = @Name, Birthday = @Birthday WHERE PetId=@PetId";
                command.Parameters.AddWithValue("@PetId", item.PetId);
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@Name", item.Name);
                command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
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
                command.CommandText = "DELETE FROM pets WHERE PetId=@PetId";
                command.Parameters.AddWithValue("@PetId", id);
                // подготовка команды к выполнению
                command.Prepare();
                // выполнение команды
                return command.ExecuteNonQuery();
            }
        }

        public List<Pet> GetAll()
        {
            List<Pet> list = new List<Pet>();
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "SELECT * FROM pets";
                // выполнение команды
                SqliteDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    Pet pet = new Pet
                    {
                        PetId = reader.GetInt32(0),
                        ClientId = reader.GetInt32(1),
                        Name = reader.GetString(2),
                        Birthday = new DateTime(reader.GetInt64(3))
                    };
                    list.Add(pet);
                }
            }
            return list;
        }

        public Pet GetById(int id)
        {
            List<Pet> list = new List<Pet>();
            using (SqliteConnection connection = new SqliteConnection(connectionString))
            // using in C# == try with resources in Jave:
            // автоматически освобождать ресурсы, в данном случае связи с БД, после выполения кода.
            {
                connection.Open();
                // прописываем в команду SQL-запрос на добавление данных
                SqliteCommand command = connection.CreateCommand();
                command.CommandText = "SELECT * FROM pets WHERE PetId = @PetId";
                command.Parameters.AddWithValue("@PetId", id);
                command.Prepare();
                // выполнение команды
                SqliteDataReader reader = command.ExecuteReader();
                if (reader.Read())
                {
                    Pet pet = new Pet
                    {
                        PetId = reader.GetInt32(0),
                        ClientId = reader.GetInt32(1),
                        Name = reader.GetString(2),
                        Birthday = new DateTime(reader.GetInt64(3))
                    };
                    return pet;
                }
            }
            return null;
        }

        
    }
}
