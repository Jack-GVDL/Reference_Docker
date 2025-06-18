PROJECT_NAME=reference_dify

all:
	@echo pull
	@echo init
	@echo up
	@echo down

pull:
	git clone https://github.com/langgenius/dify.git --branch 0.15.3

init:
	cp ./dify/docker/.env.example ./dify/docker/.env

# https://github.com/langgenius/dify/issues/5731
#
# db:
#  image: postgres:15-alpine
#  # ... other configurations ...
#  volumes:
#    - dify_postgres_data:/var/lib/postgresql/data
#
# volumes:
#  dify_postgres_data:

up:
	docker compose \
	--env-file ./dify/docker/.env \
	--project-name $(PROJECT_NAME) \
	-f ./dify/docker/docker-compose.yaml \
	up -d

down:
	docker compose \
	--env-file ./dify/docker/.env \
	--project-name $(PROJECT_NAME) \
	-f ./dify/docker/docker-compose.yaml \
	down
