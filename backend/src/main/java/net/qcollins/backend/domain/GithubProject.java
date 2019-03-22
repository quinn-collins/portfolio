package net.qcollins.backend.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "node_id",
        "name",
        "full_name",
        "private",
        "owner",
        "html_url",
        "description",
        "fork",
        "url",
        "forks_url",
        "keys_url",
        "collaborators_url",
        "teams_url",
        "hooks_url",
        "issue_events_url",
        "events_url",
        "assignees_url",
        "branches_url",
        "tags_url",
        "blobs_url",
        "git_tags_url",
        "git_refs_url",
        "trees_url",
        "statuses_url",
        "languages_url",
        "stargazers_url",
        "contributors_url",
        "subscribers_url",
        "subscription_url",
        "commits_url",
        "git_commits_url",
        "comments_url",
        "issue_comment_url",
        "contents_url",
        "compare_url",
        "merges_url",
        "archive_url",
        "downloads_url",
        "issues_url",
        "pulls_url",
        "milestones_url",
        "notifications_url",
        "labels_url",
        "releases_url",
        "deployments_url",
        "created_at",
        "updated_at",
        "pushed_at",
        "git_url",
        "ssh_url",
        "clone_url",
        "svn_url",
        "homepage",
        "size",
        "stargazers_count",
        "watchers_count",
        "language",
        "has_issues",
        "has_projects",
        "has_downloads",
        "has_wiki",
        "has_pages",
        "forks_count",
//        "mirror_url",
        "archived",
        "open_issues_count",
//        "license",
        "forks",
        "open_issues",
        "watchers",
        "default_branch"
})

@Entity
@Table(name = "GithubProject")
public class GithubProject {
    // TODO commented out classes break when using JPA to save them to database
    @Id
    @GeneratedValue
    @JsonProperty("id")
    private long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("private")
    private boolean _private;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fork")
    private boolean fork;
    @JsonProperty("url")
    private String url;
    @JsonProperty("forks_url")
    private String forksUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    @JsonProperty("teams_url")
    private String teamsUrl;
    @JsonProperty("hooks_url")
    private String hooksUrl;
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    @JsonProperty("branches_url")
    private String branchesUrl;
    @JsonProperty("tags_url")
    private String tagsUrl;
    @JsonProperty("blobs_url")
    private String blobsUrl;
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    @JsonProperty("trees_url")
    private String treesUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("languages_url")
    private String languagesUrl;
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    @JsonProperty("contents_url")
    private String contentsUrl;
    @JsonProperty("compare_url")
    private String compareUrl;
    @JsonProperty("merges_url")
    private String mergesUrl;
    @JsonProperty("archive_url")
    private String archiveUrl;
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("pulls_url")
    private String pullsUrl;
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("size")
    private long size;
    @JsonProperty("stargazers_count")
    private long stargazersCount;
    @JsonProperty("watchers_count")
    private long watchersCount;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_issues")
    private boolean hasIssues;
    @JsonProperty("has_projects")
    private boolean hasProjects;
    @JsonProperty("has_downloads")
    private boolean hasDownloads;
    @JsonProperty("has_wiki")
    private boolean hasWiki;
    @JsonProperty("has_pages")
    private boolean hasPages;
    @JsonProperty("forks_count")
    private long forksCount;
    //    @JsonProperty("mirror_url")
//    private Object mirrorUrl;
    @JsonProperty("archived")
    private boolean archived;
    @JsonProperty("open_issues_count")
    private long openIssuesCount;
    //    @JsonProperty("license")
//    private Object license;
    @JsonProperty("forks")
    private long forks;
    @JsonProperty("open_issues")
    private long openIssues;
    @JsonProperty("watchers")
    private long watchers;
    @JsonProperty("default_branch")
    private String defaultBranch;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    protected GithubProject() {
    }

    /**
     *
     * @param notificationsUrl
     * @param releasesUrl
     * @param pushedAt
     * @param gitTagsUrl
     * @param contentsUrl
     * @param blobsUrl
     * @param issueEventsUrl
     * @param nodeId
     * @param htmlUrl
     * @param _private
     * @param hooksUrl
     * @param description
     * @param commentsUrl
     * @param commitsUrl
     * @param labelsUrl
     * @param assigneesUrl
     * @param mergesUrl
     * @param fork
     * @param compareUrl
     * @param stargazersUrl
     * @param gitRefsUrl
     * @param deploymentsUrl
     * @param watchersCount
     * @param openIssuesCount
    //     * @param mirrorUrl
     * @param homepage
     * @param url
     * @param size
     * @param keysUrl
     * @param gitCommitsUrl
     * @param milestonesUrl
     * @param downloadsUrl
     * @param issueCommentUrl
     * @param pullsUrl
     * @param owner
     * @param forksUrl
     * @param hasProjects
     * @param language
     * @param statusesUrl
     * @param eventsUrl
     * @param openIssues
     * @param teamsUrl
     * @param sshUrl
     * @param contributorsUrl
     * @param stargazersCount
     * @param tagsUrl
     * @param id
     * @param hasIssues
     * @param archived
     * @param createdAt
     * @param name
     * @param treesUrl
     * @param cloneUrl
     * @param issuesUrl
    //     * @param license
     * @param gitUrl
     * @param forksCount
     * @param watchers
     * @param subscriptionUrl
     * @param svnUrl
     * @param archiveUrl
     * @param hasPages
     * @param languagesUrl
     * @param updatedAt
     * @param collaboratorsUrl
     * @param forks
     * @param hasDownloads
     * @param subscribersUrl
     * @param branchesUrl
     * @param fullName
     * @param hasWiki
     * @param defaultBranch
     */
    public GithubProject(long id, String nodeId, String name, String fullName, boolean _private, Owner owner, String htmlUrl, String description, boolean fork, String url, String forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl, String createdAt, String updatedAt, String pushedAt, String gitUrl, String sshUrl, String cloneUrl, String svnUrl, String homepage, long size, long stargazersCount, long watchersCount, String language, boolean hasIssues, boolean hasProjects, boolean hasDownloads, boolean hasWiki, boolean hasPages, long forksCount, /*Object mirrorUrl, */boolean archived, long openIssuesCount, /*Object license, */long forks, long openIssues, long watchers, String defaultBranch) {
        super();
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this._private = _private;
        this.owner = owner;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
//        this.mirrorUrl = mirrorUrl;
        this.archived = archived;
        this.openIssuesCount = openIssuesCount;
//        this.license = license;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public GithubProject withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GithubProject withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GithubProject withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GithubProject withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @JsonProperty("private")
    public boolean isPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public GithubProject withPrivate(boolean _private) {
        this._private = _private;
        return this;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public GithubProject withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GithubProject withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GithubProject withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("fork")
    public boolean isFork() {
        return fork;
    }

    @JsonProperty("fork")
    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public GithubProject withFork(boolean fork) {
        this.fork = fork;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public GithubProject withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    @JsonProperty("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public GithubProject withForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public GithubProject withKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    @JsonProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public GithubProject withCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    @JsonProperty("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public GithubProject withTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    @JsonProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public GithubProject withHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    @JsonProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public GithubProject withIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public GithubProject withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    @JsonProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public GithubProject withAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    @JsonProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public GithubProject withBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    @JsonProperty("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    @JsonProperty("tags_url")
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public GithubProject withTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    @JsonProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public GithubProject withBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    @JsonProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public GithubProject withGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    @JsonProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public GithubProject withGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    @JsonProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public GithubProject withTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public GithubProject withStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    @JsonProperty("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    @JsonProperty("languages_url")
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public GithubProject withLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    @JsonProperty("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    @JsonProperty("stargazers_url")
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public GithubProject withStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    @JsonProperty("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    @JsonProperty("contributors_url")
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public GithubProject withContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    @JsonProperty("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    @JsonProperty("subscribers_url")
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public GithubProject withSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    @JsonProperty("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public GithubProject withSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public GithubProject withCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    @JsonProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public GithubProject withGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public GithubProject withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    @JsonProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public GithubProject withIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    @JsonProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public GithubProject withContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    @JsonProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public GithubProject withCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    @JsonProperty("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    @JsonProperty("merges_url")
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public GithubProject withMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    @JsonProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public GithubProject withArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    @JsonProperty("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    @JsonProperty("downloads_url")
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public GithubProject withDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public GithubProject withIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    @JsonProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public GithubProject withPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    @JsonProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public GithubProject withMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public GithubProject withNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public GithubProject withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    @JsonProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public GithubProject withReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    @JsonProperty("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    @JsonProperty("deployments_url")
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public GithubProject withDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GithubProject withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GithubProject withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("pushed_at")
    public String getPushedAt() {
        return pushedAt;
    }

    @JsonProperty("pushed_at")
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public GithubProject withPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    @JsonProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public GithubProject withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public GithubProject withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    @JsonProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public GithubProject withCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    @JsonProperty("svn_url")
    public String getSvnUrl() {
        return svnUrl;
    }

    @JsonProperty("svn_url")
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public GithubProject withSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public GithubProject withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    @JsonProperty("size")
    public long getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(long size) {
        this.size = size;
    }

    public GithubProject withSize(long size) {
        this.size = size;
        return this;
    }

    @JsonProperty("stargazers_count")
    public long getStargazersCount() {
        return stargazersCount;
    }

    @JsonProperty("stargazers_count")
    public void setStargazersCount(long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public GithubProject withStargazersCount(long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    @JsonProperty("watchers_count")
    public long getWatchersCount() {
        return watchersCount;
    }

    @JsonProperty("watchers_count")
    public void setWatchersCount(long watchersCount) {
        this.watchersCount = watchersCount;
    }

    public GithubProject withWatchersCount(long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public GithubProject withLanguage(String language) {
        this.language = language;
        return this;
    }

    @JsonProperty("has_issues")
    public boolean isHasIssues() {
        return hasIssues;
    }

    @JsonProperty("has_issues")
    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public GithubProject withHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    @JsonProperty("has_projects")
    public boolean isHasProjects() {
        return hasProjects;
    }

    @JsonProperty("has_projects")
    public void setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public GithubProject withHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    @JsonProperty("has_downloads")
    public boolean isHasDownloads() {
        return hasDownloads;
    }

    @JsonProperty("has_downloads")
    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public GithubProject withHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    @JsonProperty("has_wiki")
    public boolean isHasWiki() {
        return hasWiki;
    }

    @JsonProperty("has_wiki")
    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public GithubProject withHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    @JsonProperty("has_pages")
    public boolean isHasPages() {
        return hasPages;
    }

    @JsonProperty("has_pages")
    public void setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
    }

    public GithubProject withHasPages(boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    @JsonProperty("forks_count")
    public long getForksCount() {
        return forksCount;
    }

    @JsonProperty("forks_count")
    public void setForksCount(long forksCount) {
        this.forksCount = forksCount;
    }

    public GithubProject withForksCount(long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

//    @JsonProperty("mirror_url")
//    public Object getMirrorUrl() {
//        return mirrorUrl;
//    }
//
//    @JsonProperty("mirror_url")
//    public void setMirrorUrl(Object mirrorUrl) {
//        this.mirrorUrl = mirrorUrl;
//    }
//
//    public GithubProject withMirrorUrl(Object mirrorUrl) {
//        this.mirrorUrl = mirrorUrl;
//        return this;
//    }

    @JsonProperty("archived")
    public boolean isArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public GithubProject withArchived(boolean archived) {
        this.archived = archived;
        return this;
    }

    @JsonProperty("open_issues_count")
    public long getOpenIssuesCount() {
        return openIssuesCount;
    }

    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public GithubProject withOpenIssuesCount(long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

//    @JsonProperty("license")
//    public Object getLicense() {
//        return license;
//    }
//
//    @JsonProperty("license")
//    public void setLicense(Object license) {
//        this.license = license;
//    }
//
//    public GithubProject withLicense(Object license) {
//        this.license = license;
//        return this;
//    }

    @JsonProperty("forks")
    public long getForks() {
        return forks;
    }

    @JsonProperty("forks")
    public void setForks(long forks) {
        this.forks = forks;
    }

    public GithubProject withForks(long forks) {
        this.forks = forks;
        return this;
    }

    @JsonProperty("open_issues")
    public long getOpenIssues() {
        return openIssues;
    }

    @JsonProperty("open_issues")
    public void setOpenIssues(long openIssues) {
        this.openIssues = openIssues;
    }

    public GithubProject withOpenIssues(long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    @JsonProperty("watchers")
    public long getWatchers() {
        return watchers;
    }

    @JsonProperty("watchers")
    public void setWatchers(long watchers) {
        this.watchers = watchers;
    }

    public GithubProject withWatchers(long watchers) {
        this.watchers = watchers;
        return this;
    }

    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public GithubProject withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    public GithubProject withAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//        return this;
//    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("nodeId", nodeId).append("name", name)
                .append("fullName", fullName).append("_private", _private).append("owner", owner)
                .append("htmlUrl", htmlUrl).append("description", description).append("fork", fork).append("url", url)
                .append("forksUrl", forksUrl).append("keysUrl", keysUrl).append("collaboratorsUrl", collaboratorsUrl)
                .append("teamsUrl", teamsUrl).append("hooksUrl", hooksUrl).append("issueEventsUrl", issueEventsUrl)
                .append("eventsUrl", eventsUrl).append("assigneesUrl", assigneesUrl).append("branchesUrl", branchesUrl)
                .append("tagsUrl", tagsUrl).append("blobsUrl", blobsUrl).append("gitTagsUrl", gitTagsUrl)
                .append("gitRefsUrl", gitRefsUrl).append("treesUrl", treesUrl).append("statusesUrl", statusesUrl)
                .append("languagesUrl", languagesUrl).append("stargazersUrl", stargazersUrl)
                .append("contributorsUrl", contributorsUrl).append("subscribersUrl", subscribersUrl)
                .append("subscriptionUrl", subscriptionUrl).append("commitsUrl", commitsUrl)
                .append("gitCommitsUrl", gitCommitsUrl).append("commentsUrl", commentsUrl)
                .append("issueCommentUrl", issueCommentUrl).append("contentsUrl", contentsUrl)
                .append("compareUrl", compareUrl).append("mergesUrl", mergesUrl).append("archiveUrl", archiveUrl)
                .append("downloadsUrl", downloadsUrl).append("issuesUrl", issuesUrl).append("pullsUrl", pullsUrl)
                .append("milestonesUrl", milestonesUrl).append("notificationsUrl", notificationsUrl)
                .append("labelsUrl", labelsUrl).append("releasesUrl", releasesUrl)
                .append("deploymentsUrl", deploymentsUrl).append("createdAt", createdAt).append("updatedAt", updatedAt)
                .append("pushedAt", pushedAt).append("gitUrl", gitUrl).append("sshUrl", sshUrl)
                .append("cloneUrl", cloneUrl).append("svnUrl", svnUrl).append("homepage", homepage).append("size", size)
                .append("stargazersCount", stargazersCount).append("watchersCount", watchersCount)
                .append("language", language).append("hasIssues", hasIssues).append("hasProjects", hasProjects)
                .append("hasDownloads", hasDownloads).append("hasWiki", hasWiki).append("hasPages", hasPages)
                .append("forksCount", forksCount)/*.append("mirrorUrl", mirrorUrl)*/.append("archived", archived)
                .append("openIssuesCount", openIssuesCount)/*.append("license", license)*/.append("forks", forks)
                .append("openIssues", openIssues).append("watchers", watchers).append("defaultBranch", defaultBranch)
                /*.append("additionalProperties", additionalProperties)*/.toString();
    }

}