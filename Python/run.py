import time
import random
import logging

# Set up logging configuration
logging.basicConfig(
	format='%(asctime)s %(levelname)s: %(message)s',
	datefmt='%Y-%m-%d %H:%M:%S',
	level=logging.INFO
)


# Function to generate a fake log message
def generate_log_message():
	log_levels = ['DEBUG', 'INFO', 'WARNING', 'ERROR', 'CRITICAL']
	log_level = random.choice(log_levels)
	log_message = f"This is a {log_level.lower()} log message."

	if log_level == 'DEBUG':
		logging.debug(log_message)
	elif log_level == 'INFO':
		logging.info(log_message)
	elif log_level == 'WARNING':
		logging.warning(log_message)
	elif log_level == 'ERROR':
		logging.error(log_message)
	elif log_level == 'CRITICAL':
		logging.critical(log_message)


# Main loop to continuously generate log messages
while True:
	generate_log_message()
	time.sleep(random.uniform(0.1, 1.0))
