pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('cogito-backend-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Neo-sunny/cogito.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}