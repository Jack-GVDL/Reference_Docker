NGINX_PORT = 55003
PROJECT_NAME = reference_nginx

all:
	@echo init
	@echo up
	@echo down
	@echo update-config

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'NGINX_PORT=$(NGINX_PORT)' >> .env

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

update-config:
	docker exec Reference-Nginx-Http nginx -t
	docker exec Reference-Nginx-Http nginx -s reload
