API_KEY=
CONTAINER_NAME=Reference-ShellGpt
PROJECT_NAME=reference_shellgpt

all:
	@echo build
	@echo init
	@echo up
	@echo down

build:
	docker build -f ./docker/dockerfile -t shell-gpt .

init: init-env

init-env:
	rm -f .env
	touch .env
	@echo 'API_KEY=$(API_KEY)' >> .env

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

shell:
	docker exec -it $(CONTAINER_NAME) sh
