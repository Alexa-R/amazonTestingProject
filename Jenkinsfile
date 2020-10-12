pipeline { 
    agent any
    tools{
        maven '3.6.3'
    }
    stages{
        stage('Parallel'){
            parallel{
               stage ('run on chrome') {
                    steps{
                        sh 'mvn clean -Dselenide.browser=chrome -Dselenide.remote=http://localhost:4444/wd/hub test'
                    }
                }
                stage ('run on firefox') {
                    steps{
                        sh 'mvn clean -Dselenide.browser=firefox -DbrowserVersion=46.0.1 -Dselenide.remote=http://localhost:4444/wd/hub test'
                    }
                }
            }
        }
        stage('allure'){
            steps{
            sh 'mvn allure:serve'
            }
        }
    }
}
