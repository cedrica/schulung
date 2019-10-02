package de.sdvrz.kbs.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;

class MavenPragmaMojo extends AbstractMojo {
    @Parameter
    private boolean ladeProgramInGitlab;
    @Parameter
    private boolean terminateProgrammAfterBuild;
    public void execute() throws MojoFailureException {

    }
}
