#!/bin/bash

# Stop on errors
set -e

# Variables
IMAGE_NAME="dbank-app"

# Clean and build using Dockerfile
docker build -t $IMAGE_NAME .

echo "✅ Docker image '$IMAGE_NAME' built successfully."
