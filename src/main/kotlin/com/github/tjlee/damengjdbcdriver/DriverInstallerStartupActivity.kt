package com.github.tjlee.damengjdbcdriver

import com.intellij.openapi.components.service
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class DriverInstallerStartupActivity : ProjectActivity {
    private val logger = Logger.getInstance(DriverInstallerStartupActivity::class.java)

    override suspend fun execute(project: Project) {
        logger.info("Dameng JDBC driver startup: installing bundled driver")
        service<DriverInstaller>().installDrivers()
    }
}
