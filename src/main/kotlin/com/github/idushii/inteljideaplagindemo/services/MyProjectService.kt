package com.github.idushii.inteljideaplagindemo.services

import com.intellij.openapi.project.Project
import com.github.idushii.inteljideaplagindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
