PROJECT_NAME=saya-script

all: setup build services

npm:
	lein npm install

setup: npm css

build:
	lein build

run:
	lein run

services:
	tmux new-window -n "${PROJECT_NAME} (figwheel)" lein figwheel
	tmux new-window -n "${PROJECT_NAME} (less)" lein less auto

less:
	lein less once

clean:
	lein clean
	-rm -f app/css/app.css

# run this target after setup
css:
	@echo '>>' Extracting CSS files from jars...
  # unzip -n -j ~/.m2/repository/cljsjs/react-dates/12.2.4-1/react-dates-12.2.4-1.jar \cljsjs/react-dates/production/react-dates.min.inc.css -d app/css
	@echo '>>' Done.
