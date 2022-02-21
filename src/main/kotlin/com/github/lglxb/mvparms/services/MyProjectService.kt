package com.github.lglxb.mvparms.services

import com.intellij.openapi.project.Project
import com.github.lglxb.mvparms.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
