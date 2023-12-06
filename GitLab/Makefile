GITLAB_SERVER_HTTP_PORT=55053
GITLAB_SERVER_HTTPS_PORT=55054
GITLAB_SERVER_SSH_PORT=55055
ROOT_PASSWORD=$(shell openssl rand -hex 20)
GITLAB_CONTAINER_NAME=Reference-GitLab
PROJECT_NAME=reference_gitlab

all:
	@echo init
	@echo up
	@echo down
	@echo clean

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'GITLAB_SERVER_HTTP_PORT=$(GITLAB_SERVER_HTTP_PORT)' >> .env
	@echo 'GITLAB_SERVER_HTTPS_PORT=$(GITLAB_SERVER_HTTPS_PORT)' >> .env
	@echo 'GITLAB_SERVER_SSH_PORT=$(GITLAB_SERVER_SSH_PORT)' >> .env
	@echo 'ROOT_PASSWORD=$(ROOT_PASSWORD)' >> .env
	@echo 'GITLAB_CONTAINER_NAME=$(GITLAB_CONTAINER_NAME)' >> .env

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

clean:
	docker volume rm $(PROJECT_NAME)_Reference_GitLab_Etc
	docker volume rm $(PROJECT_NAME)_Reference_GitLab_Opt
