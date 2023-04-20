def call(){
    agent { label "LabVIEW1" }
    echo 'Cleaning out workspace  directory: '+env.WORKSPACE
    deleteDir()
}
