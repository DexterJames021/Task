# Build the image
docker build -t bankapp .

# Run the container
docker run -p 8080:8080 bankapp

# Test it works
curl http://localhost:8080