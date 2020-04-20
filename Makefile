## ------------------------------------- ENVIRONMENT -------------------------------------

MICROSERVICE_NAME  = microservice-payment
IMAGE_TAG          = 1.0.0
IMAGE_NAME         = $(MICROSERVICE_NAME):$(IMAGE_TAG)
CONTAINER_NAME     = $(MICROSERVICE_NAME)-backend

## ------------------------------------- TASK ------------------------------------------

build:
	docker build -t $(IMAGE_NAME) .

up:
	@IMAGE_NAME=$(IMAGE_NAME)         \
	CONTAINER_NAME=$(CONTAINER_NAME)  \
	docker-compose up

down:
	docker-compose down