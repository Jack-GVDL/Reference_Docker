PROJECT_NAME=docker-reference/python

all:
	@echo "Run command"
	@echo "build"
	@echo "up"
	@echo "down"

create-requirement:
	pip freeze > requirements.txt

build: create-requirement
	docker build -f ./docker/dockerfile -t $(PROJECT_NAME) .

up: build
	docker-compose -f docker/compose.yml \
		--env-file ./docker/.env \
		up -d

down:
	docker-compose -f docker/compose.yml \
		--env-file ./docker/.env \
		down
