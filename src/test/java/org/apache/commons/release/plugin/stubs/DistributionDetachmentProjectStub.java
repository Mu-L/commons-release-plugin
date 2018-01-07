/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.release.plugin.stubs;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.plugin.testing.stubs.ArtifactStub;
import org.apache.maven.plugin.testing.stubs.MavenProjectStub;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Stub for {@link MavenProject} for the {@link CommonsDistributionDetachmentMojoTest}.
 *
 * @author chtompki
 */
public class DistributionDetachmentProjectStub extends MavenProjectStub {

    private List<Artifact> attachedArtifacts;

    @Override
    public List<Artifact> getAttachedArtifacts() {
        attachedArtifacts = new ArrayList<>();
        attachedArtifacts.add(
                new DistributionDetatchmentArtifactStub(
                        new File("src/test/resources/mojos/detach-distributions/target/mockAttachedFile.html"),
                        "html"
                )
        );
        attachedArtifacts.add(
                new DistributionDetatchmentArtifactStub(
                        new File("src/test/resources/mojos/detach-distributions/target/mockAttachedTar.tar.gz"),
                        "tar.gz"
                )
        );
        attachedArtifacts.add(
                new DistributionDetatchmentArtifactStub(
                        new File("src/test/resources/mojos/detach-distributions/target/mockAttachedTar.tar.gz.asc"),
                        "tar.gz.asc"
                )
        );
        attachedArtifacts.add(
                new DistributionDetatchmentArtifactStub(
                        new File("src/test/resources/mojos/detach-distributions/target/mockAttachedZip.zip"),
                        "zip"
                )
        );
        attachedArtifacts.add(
                new DistributionDetatchmentArtifactStub(
                        new File("src/test/resources/mojos/detach-distributions/target/mockAttachedZip.zip.asc"),
                        "zip.asc"
                )
        );
        return attachedArtifacts;
    }

    public class DistributionDetatchmentArtifactStub extends ArtifactStub {

        private File artifact;

        private String type;

        public DistributionDetatchmentArtifactStub(File file, String type) {
            this.artifact = file;
            this.type = type;
        }

        public File getFile() {
            return this.artifact;
        }

        public String getType() {
            return this.type;
        }
    }
}