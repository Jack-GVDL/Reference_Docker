PROJECT_NAME=docker-reference/raw

all:
	@echo "Run command"
	@echo "build"
	@echo "build-{common/executor/gateway}"
	@echo "up"
	@echo "down"
	@echo "clean-images"

build: build-executor build-gateway

build-common:
	docker build -f ./docker/dockerfile-common -t $(PROJECT_NAME)/common .

build-runtime:
	docker build -f ./docker/dockerfile-runtime -t $(PROJECT_NAME)/runtime .

build-executor: build-common build-runtime
	docker build \
		-f ./docker/dockerfile-service \
		--build-arg SERVICE=executor \
		-t $(PROJECT_NAME)/executor .

build-gateway: build-common build-runtime
	docker build \
		-f ./docker/dockerfile-service \
		--build-arg SERVICE=gateway \
		-t $(PROJECT_NAME)/gateway .

up: build
	docker-compose -f docker/compose.yml \
		--env-file ./docker/.env \
		up -d

down:
	docker-compose -f docker/compose.yml \
		--env-file ./docker/.env \
		down

# - https://forums.docker.com/t/how-to-remove-none-images-after-building/7050/2
clean-images:
	docker images -f dangling=true -q
	docker rmi $$(docker images -f "dangling=true" -q | tr "\n" " ")
