PROJECT_NAME = reference_eureka-server

all:
	@echo build
	@echo up
	@echo down

build:
	docker build -f ./docker/dockerfile -t eureka-server .

up:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	up -d

down:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	down
