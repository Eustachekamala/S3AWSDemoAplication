# S3 Demo Application

This is a simple Spring Boot application that demonstrates how to upload and download files to and from an AWS S3 bucket.

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java Development Kit (JDK) 17 or later](https://www.oracle.com/java/technologies/downloads/)
- [Apache Maven](https://maven.apache.org/download.cgi)
- An AWS account with a configured S3 bucket and IAM user with S3 access.

## Configuration

1. Clone the repository:

    ```bash
    git clone git@github.com:Eustachekamala/S3AWSDemoAplication.git
    ```

2. Navigate to the project directory:

    ```bash
    cd S3DemoApplication
    ```

3. Open the `src/main/resources/application.yaml` file and update the following properties with your AWS credentials and S3 bucket information:

    ```yaml
    cloud:
      aws:
        credentials:
          access-key: YOUR_AWS_ACCESS_KEY
          secret-key: YOUR_AWS_SECRET_KEY
        region:
          static: YOUR_AWS_REGION
    
    aws:
      s3:
        bucket-name: YOUR_S3_BUCKET_NAME
    ```

## Running the Application

You can run the application using the Maven Spring Boot plugin:

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

The application provides the following REST endpoints:

### Upload File

- **Method:** `POST`
- **URL:** `/upload`
- **Description:** Uploads a file to the configured S3 bucket.
- **Form Data:**

  - `file`: The file to upload.

- **Example using cURL:**

    ```bash
    curl -X POST -F "file=@/path/to/your/file.jpg" http://localhost:8080/upload
    ```

### Download File

- **Method:** `GET`
- **URL:** `/download/{fileName}`
- **Description:** Downloads a file from the configured S3 bucket.
- **Path Variable:**
  - `fileName`: The name of the file to download.

- **Example using cURL:**

    ```bash
    curl -o downloaded_file.jpg http://localhost:8080/download/your-file.jpg
    ```
