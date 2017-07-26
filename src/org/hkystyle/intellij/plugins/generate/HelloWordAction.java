/**
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package org.hkystyle.intellij.plugins.generate;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by hukaiyang on 2017/7/26.
 */
public class HelloWordAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        String userName = askForName(project);
        sayHello(project, userName);
    }

    private String askForName(Project project) {
        return Messages.showInputDialog(project,
                "What is your name?", "Input Your Name",
                Messages.getQuestionIcon());
    }

    private void sayHello(Project project, String userName) {
        Messages.showMessageDialog(project,
                String.format("Hello, %s!\n Welcome to Intellij Plugins.", userName), "Information",
                Messages.getInformationIcon());
    }
}
