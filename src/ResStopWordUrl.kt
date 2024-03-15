import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class ResStopWordUrl(
	@SerializedName("payload") val payload: Payload? = null,
	@SerializedName("title") val title: String? = null
)

@Serializable
data class JsonMember(
	@SerializedName("totalCount") val totalCount: Int? = null,
	@SerializedName("items") val items: List<ItemsItem?>? = null
)

@Serializable
data class LineInfo(
	@SerializedName("truncatedSloc") val truncatedSloc: String? = null,
	@SerializedName("truncatedLoc") val truncatedLoc: String? = null
)

@Serializable
data class Symbols(
	@SerializedName("timed_out") val timedOut: Boolean? = null,
	@SerializedName("symbols") val symbols: List<Any?>? = null,
	@SerializedName("not_analyzed") val notAnalyzed: Boolean? = null
)

@Serializable
data class ReposPreferences(
	@SerializedName("post") val post: String? = null
)

@Serializable
data class TopBannersInfo(
	@SerializedName("globalPreferredFundingPath") val globalPreferredFundingPath: Any? = null,
	@SerializedName("overridingGlobalFundingFile") val overridingGlobalFundingFile: Boolean? = null,
	@SerializedName("showInvalidCitationWarning") val showInvalidCitationWarning: Boolean? = null,
	@SerializedName("actionsOnboardingTip") val actionsOnboardingTip: Any? = null,
	@SerializedName("citationHelpUrl") val citationHelpUrl: String? = null
)

@Serializable
data class Repo(
	@SerializedName("createdAt") val createdAt: String? = null,
	@SerializedName("private") val jsonMemberPrivate: Boolean? = null,
	@SerializedName("currentUserCanPush") val currentUserCanPush: Boolean? = null,
	@SerializedName("public") val jsonMemberPublic: Boolean? = null,
	@SerializedName("ownerAvatar") val ownerAvatar: String? = null,
	@SerializedName("defaultBranch") val defaultBranch: String? = null,
	@SerializedName("name") val name: String? = null,
	@SerializedName("isEmpty") val isEmpty: Boolean? = null,
	@SerializedName("id") val id: Int? = null,
	@SerializedName("isFork") val isFork: Boolean? = null,
	@SerializedName("ownerLogin") val ownerLogin: String? = null,
	@SerializedName("isOrgOwned") val isOrgOwned: Boolean? = null
)

@Serializable
data class PlanSupportInfo(
	@SerializedName("repoOwnedByCurrentUser") val repoOwnedByCurrentUser: Any? = null,
	@SerializedName("requestFullPath") val requestFullPath: String? = null,
	@SerializedName("showPlanSupportBanner") val showPlanSupportBanner: Any? = null,
	@SerializedName("upgradeDataAttributes") val upgradeDataAttributes: Any? = null,
	@SerializedName("repoIsFork") val repoIsFork: Any? = null,
	@SerializedName("showFreeOrgGatedFeatureMessage") val showFreeOrgGatedFeatureMessage: Any? = null,
	@SerializedName("upgradePath") val upgradePath: Any? = null
)

@Serializable
data class ItemsItem(
	@SerializedName("path") val path: String? = null,
	@SerializedName("name") val name: String? = null,
	@SerializedName("contentType") val contentType: String? = null
)

@Serializable
data class HeaderInfo(
	@SerializedName("isCSV") val isCSV: Boolean? = null,
	@SerializedName("onBranch") val onBranch: Boolean? = null,
	@SerializedName("ghDesktopPath") val ghDesktopPath: String? = null,
	@SerializedName("toc") val toc: Any? = null,
	@SerializedName("deleteTooltip") val deleteTooltip: String? = null,
	@SerializedName("mode") val mode: String? = null,
	@SerializedName("editTooltip") val editTooltip: String? = null,
	@SerializedName("blobSize") val blobSize: String? = null,
	@SerializedName("lineInfo") val lineInfo: LineInfo? = null,
	@SerializedName("isRichtext") val isRichtext: Boolean? = null,
	@SerializedName("isGitLfs") val isGitLfs: Boolean? = null,
	@SerializedName("siteNavLoginPath") val siteNavLoginPath: String? = null,
	@SerializedName("shortPath") val shortPath: String? = null
)

@Serializable
data class StopwordsIsoStopwordsEnBranches(
	@SerializedName("post") val post: String? = null
)

@Serializable
data class Blob(
	@SerializedName("headerInfo") val headerInfo: HeaderInfo? = null,
	@SerializedName("symbolsEnabled") val symbolsEnabled: Boolean? = null,
	@SerializedName("rawLines") val rawLines: List<String?>? = null,
	@SerializedName("isPlain") val isPlain: Boolean? = null,
	@SerializedName("displayName") val displayName: String? = null,
	@SerializedName("csv") val csv: Any? = null,
	@SerializedName("languageID") val languageID: Int? = null,
	@SerializedName("language") val language: String? = null,
	@SerializedName("symbols") val symbols: Symbols? = null,
	@SerializedName("topBannersInfo") val topBannersInfo: TopBannersInfo? = null,
	@SerializedName("colorizedLines") val colorizedLines: Any? = null,
	@SerializedName("tabSize") val tabSize: Int? = null,
	@SerializedName("isValidLegacyIssueTemplate") val isValidLegacyIssueTemplate: Boolean? = null,
	@SerializedName("shortPath") val shortPath: Any? = null,
	@SerializedName("issueTemplate") val issueTemplate: Any? = null,
	@SerializedName("image") val image: Boolean? = null,
	@SerializedName("planSupportInfo") val planSupportInfo: PlanSupportInfo? = null,
	@SerializedName("publishBannersInfo") val publishBannersInfo: PublishBannersInfo? = null,
	@SerializedName("large") val large: Boolean? = null,
	@SerializedName("stylingDirectives") val stylingDirectives: List<List<Any?>?>? = null,
	@SerializedName("truncated") val truncated: Boolean? = null,
	@SerializedName("richText") val richText: Any? = null,
	@SerializedName("isCodeownersFile") val isCodeownersFile: Any? = null,
	@SerializedName("displayUrl") val displayUrl: String? = null,
	@SerializedName("discussionTemplate") val discussionTemplate: Any? = null,
	@SerializedName("viewable") val viewable: Boolean? = null,
	@SerializedName("rawBlobUrl") val rawBlobUrl: String? = null,
	@SerializedName("dependabotInfo") val dependabotInfo: DependabotInfo? = null,
	@SerializedName("workflowRedirectUrl") val workflowRedirectUrl: Any? = null,
	@SerializedName("csvError") val csvError: Any? = null,
	@SerializedName("renderImageOrRaw") val renderImageOrRaw: Boolean? = null,
	@SerializedName("renderedFileInfo") val renderedFileInfo: Any? = null
)

@Serializable
data class Payload(
	@SerializedName("treeExpanded") val treeExpanded: Boolean? = null,
	@SerializedName("refInfo") val refInfo: RefInfo? = null,
	@SerializedName("fileTreeProcessingTime") val fileTreeProcessingTime: Any? = null,
	@SerializedName("repo") val repo: Repo? = null,
	@SerializedName("symbolsExpanded") val symbolsExpanded: Boolean? = null,
	@SerializedName("path") val path: String? = null,
	@SerializedName("allShortcutsEnabled") val allShortcutsEnabled: Boolean? = null,
	@SerializedName("currentUser") val currentUser: Any? = null,
	@SerializedName("blob") val blob: Blob? = null,
	@SerializedName("foldersToFetch") val foldersToFetch: List<Any?>? = null,
	@SerializedName("copilotAccessAllowed") val copilotAccessAllowed: Boolean? = null,
	@SerializedName("copilotInfo") val copilotInfo: Any? = null
)

@Serializable
data class DependabotInfo(
	@SerializedName("configFilePath") val configFilePath: Any? = null,
	@SerializedName("configurationNoticeDismissed") val configurationNoticeDismissed: Any? = null,
	@SerializedName("showConfigurationBanner") val showConfigurationBanner: Boolean? = null,
	@SerializedName("networkDependabotPath") val networkDependabotPath: String? = null,
	@SerializedName("dismissConfigurationNoticePath") val dismissConfigurationNoticePath: String? = null
)

@Serializable
data class RefInfo(
	@SerializedName("currentOid") val currentOid: String? = null,
	@SerializedName("canEdit") val canEdit: Boolean? = null,
	@SerializedName("name") val name: String? = null,
	@SerializedName("refType") val refType: String? = null,
	@SerializedName("listCacheKey") val listCacheKey: String? = null
)

@Serializable
data class PublishBannersInfo(
	@SerializedName("dismissActionNoticePath") val dismissActionNoticePath: String? = null,
	@SerializedName("releasePath") val releasePath: String? = null,
	@SerializedName("showPublishActionBanner") val showPublishActionBanner: Boolean? = null
)

