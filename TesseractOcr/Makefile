TESSERACT_OCR_CONTAINER_NAME=Reference-Tesseract-Ocr
PROJECT_NAME=reference_tesseract_ocr

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'TESSERACT_OCR_CONTAINER_NAME=$(TESSERACT_OCR_CONTAINER_NAME)' >> .env

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

test:
	docker exec $(TESSERACT_OCR_CONTAINER_NAME) tesseract /example/Example_1.png stdout
