def call() {
                sh "apt-get update && apt-get install -y python3"
                sh "apt-get install -y python3-pip"
                sh "pip3 install pytest"
                sh "pip3 install pylint"
                sh "pip3 install -r requirements.txt"
           }
