<!---
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->
<!---
 +======================================================================+
 |****                                                              ****|
 |****      THIS FILE IS GENERATED BY THE COMMONS BUILD PLUGIN      ****|
 |****                    DO NOT EDIT DIRECTLY                      ****|
 |****                                                              ****|
 +======================================================================+
 | TEMPLATE FILE: contributing-md-template.md                           |
 | commons-build-plugin/trunk/src/main/resources/commons-xdoc-templates |
 +======================================================================+
 |                                                                      |
 | 1) Re-generate using: mvn commons-build:contributing-md              |
 |                                                                      |
 | 2) Set the following properties in the component's pom:              |
 |    - commons.jira.id  (required, alphabetic, upper case)             |
 |                                                                      |
 | 3) Example Properties                                                |
 |                                                                      |
 |  <properties>                                                        |
 |    <commons.jira.id>MATH</commons.jira.id>                           |
 |  </properties>                                                       |
 |                                                                      |
 +======================================================================+
--->
Contributing to Apache Commons Release Plugin
======================

Have you found a bug or have an idea for a cool new feature? Contributing code is a great way to give something back to the open-source community.
Before you dig right into the code, we need contributors to follow a few guidelines to have a chance of keeping on top of things.

Getting Started
---------------

+ Make sure you have a [JIRA account](https://issues.apache.org/jira/).
+ Make sure you have a [GitHub account](https://github.com/signup/free). This is not essential, but makes providing patches much easier.
+ If you're planning to implement a new feature it makes sense to discuss your changes on the [dev list](https://commons.apache.org/mail-lists.html) first. This way you can make sure you're not wasting your time on something that isn't considered to be in Apache Commons Release Plugin's scope.
+ Submit a [Jira Ticket][jira] for your issue, assuming one does not already exist.
  + Clearly describe the issue including steps to reproduce when it is a bug.
  + Make sure you fill in the earliest version that you know has the issue.
+ Find the corresponding [repository on GitHub](https://github.com/apache/?query=commons-),
[fork](https://help.github.com/articles/fork-a-repo/) and check out your forked repository. If you don't have a GitHub account, you can still clone the Commons repository.

Making Changes
--------------

+ Create a _topic branch_ for your isolated work.
  * Usually you should base your branch from the `master` branch.
  * A good topic branch name can be the JIRA bug ID plus a keyword, e.g. `COMMONSSITE-123-InputStream`.
  * If you have submitted multiple JIRA issues, try to maintain separate branches and pull requests.
+ Make commits of logical units.
  * Make sure your commit messages are meaningful and in the proper format. Your commit message should contain the key of the JIRA issue.
  * For example, `[COMMONSSITE-123] Close input stream sooner`
+ Respect the original code style:
  + Only use spaces for indentation; you can check for unnecessary whitespace with `git diff` before committing.
  + Create minimal diffs - disable _On Save_ actions like _Reformat Source Code_ or _Organize Imports_. If you feel the source code should be reformatted create a separate PR for this change first.
+ Write unit tests that match behavioral changes, where the tests fail if the changes to the runtime are not applied. This may not always be possible but is a best-practice.
Unit tests are typically in the `src/test/java` directory.
+ Run a successful build using the default [Maven](https://maven.apache.org/) goal with `mvn`; that's `mvn` on the command line by itself.
+ Write a pull request description that is detailed enough to understand what the pull request does, how, and why.
+ Each commit in the pull request should have a meaningful subject line and body. Note that commits might be squashed by a maintainer on merge.


Making Trivial Changes
----------------------

The JIRA tickets are used to generate the changelog for the next release.

For changes of a trivial nature to comments and documentation, it is not always necessary to create a new ticket in JIRA.
In this case, it is appropriate to start the first line of a commit with '[doc]' or '[javadoc]' instead of a ticket number.


Submitting Changes
------------------

+ Sign and submit the Apache [Contributor License Agreement][cla] if you haven't already.
  * Note that small patches & typical bug fixes do not require a CLA as
    clause 5 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0.html#contributions)
    covers them.
+ Push your changes to a topic branch in your fork of the repository.
+ Submit a _Pull Request_ to the corresponding repository in the `apache` organization.
  * Verify _Files Changed_ shows only your intended changes and does not
  include additional files like `target/*.class`
+ Update your JIRA ticket and include a link to the pull request in the ticket.

If you prefer to not use GitHub, then you can instead use
`git format-patch` (or `svn diff`) and attach the patch file to the JIRA issue.


Additional Resources
--------------------

+ [Contributing patches](https://commons.apache.org/patches.html)
+ [Apache Commons Release Plugin JIRA project page][jira]
+ [Contributor License Agreement][cla]
+ [General GitHub documentation](https://help.github.com/)
+ [GitHub pull request documentation](https://help.github.com/articles/creating-a-pull-request/)
+ [Apache Commons Twitter Account](https://twitter.com/ApacheCommons)

[cla]:https://www.apache.org/licenses/#clas
[jira]:https://issues.apache.org/jira/browse/COMMONSSITE
