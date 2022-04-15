package me.chanjar.weixin.cp.bean.messagebuilder;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.cp.bean.message.WxCpMessage;
import me.chanjar.weixin.cp.bean.templatecard.*;

import java.util.List;

/**
 * <pre>
 * 模板卡片消息Builder
 * 用法: WxCustomMessage m = WxCustomMessage.TEMPLATECARD().title(...)....toUser(...).build();
 * </pre>
 *
 * @author yzts</ a>
 * @date 2019-05-16
 */
public class TemplateCardBuilder extends BaseBuilder<TemplateCardBuilder> {
  /**
   * 模板卡片类型，文本通知型卡片填写 “text_notice”,
   * 图文展示型卡片此处填写 “news_notice”,
   * 按钮交互型卡片填写”button_interaction”,
   * 投票选择型卡片填写”vote_interaction”,
   * 多项选择型卡片填写 “multiple_interaction”
   */
  private String cardType;

  /**
   * 卡片来源样式信息，不需要来源样式可不填写
   * 来源图片的url
   */
  private String sourceIconUrl;
  /**
   * 卡片来源样式信息，不需要来源样式可不填写
   * 来源图片的描述，建议不超过20个字
   */
  private String sourceDesc;

  /**
   * 一级标题，建议不超过36个字
   */
  private String mainTitleTitle;
  /**
   * 标题辅助信息，建议不超过44个字
   */
  private String mainTitleDesc;

  /**
   * 图文展示型的卡片必须有图片字段。
   * 图片的url.
   */
  private String cardImageUrl;

  /**
   * 图片的宽高比，宽高比要小于2.25，大于1.3，不填该参数默认1.3
   */
  private Float cardImageAspectRatio;
  /**
   * 关键数据样式
   * 关键数据样式的数据内容，建议不超过14个字
   */
  private String emphasisContentTitle;
  /**
   * 关键数据样式的数据描述内容，建议不超过22个字
   */
  private String emphasisContentDesc;

  /**
   * 二级普通文本，建议不超过160个字
   */
  private String subTitleText;

  /**
   * 卡片二级垂直内容，该字段可为空数组，但有数据的话需确认对应字段是否必填，列表长度不超过4
   */
  private List<VerticalContent> verticalContents;

  /**
   * 二级标题+文本列表，该字段可为空数组，但有数据的话需确认对应字段是否必填，列表长度不超过6
   */
  private List<HorizontalContent> horizontalContents;

  /**
   * 跳转指引样式的列表，该字段可为空数组，但有数据的话需确认对应字段是否必填，列表长度不超过3
   */
  private List<TemplateCardJump> jumps;

  /**
   * 整体卡片的点击跳转事件，text_notice必填本字段
   * 跳转事件类型，1 代表跳转url，2 代表打开小程序。text_notice卡片模版中该字段取值范围为[1,2]
   */
  private Integer cardActionType;
  /**
   * 跳转事件的url，card_action.type是1时必填
   */
  private String cardActionUrl;

  /**
   * 跳转事件的小程序的appid，必须是与当前应用关联的小程序，card_action.type是2时必填
   */
  private String cardActionAppid;

  /**
   * 跳转事件的小程序的pagepath，card_action.type是2时选填
   */
  private String cardActionPagepath;

  /**
   * 任务id，同一个应用任务id不能重复，只能由数字、字母和“_-@”组成，最长128字节
   */
  private String taskId;

  /**
   * 按钮交互型卡片需指定。
   * 按钮列表，该字段可为空数组，但有数据的话需确认对应字段是否必填，列表长度不超过6
   */
  private List<TemplateCardButton> buttons;

  /**
   * 投票选择型卡片需要指定
   * 选择题key值，用户提交选项后，会产生回调事件，回调事件会带上该key值表示该题，最长支持1024字节
   */
  private String checkboxQuestionKey;

  /**
   * 选择题模式，单选：0，多选：1，不填默认0
   */
  private Integer checkboxMode;

  /**
   * 选项list，选项个数不超过 20 个，最少1个
   */
  private List<CheckboxOption> options;

  /**
   * 提交按钮样式
   * 按钮文案，建议不超过10个字，不填默认为提交
   */
  private String submitButtonText;
  /**
   * 提交按钮的key，会产生回调事件将本参数作为EventKey返回，最长支持1024字节
   */
  private String submitButtonKey;

  /**
   * 下拉式的选择器列表，multiple_interaction类型的卡片该字段不可为空，一个消息最多支持 3 个选择器
   */
  private List<MultipleSelect> selects;

  /**
   * 引用文献样式
   */
  private QuoteArea quoteArea;


  public TemplateCardBuilder() {
    this.msgType = WxConsts.KefuMsgType.TEMPLATE_CARD;
  }

  public TemplateCardBuilder cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  public TemplateCardBuilder cardImageUrl(String cardImageUrl) {
    this.cardImageUrl = cardImageUrl;
    return this;
  }

  public TemplateCardBuilder cardImageAspectRatio(Float cardImageAspectRatio) {
    this.cardImageAspectRatio = cardImageAspectRatio;
    return this;
  }

  public TemplateCardBuilder sourceIconUrl(String sourceIconUrl) {
    this.sourceIconUrl = sourceIconUrl;
    return this;
  }

  public TemplateCardBuilder sourceDesc(String sourceDesc) {
    this.sourceDesc = sourceDesc;
    return this;
  }

  public TemplateCardBuilder mainTitleTitle(String mainTitleTitle) {
    this.mainTitleTitle = mainTitleTitle;
    return this;
  }

  public TemplateCardBuilder mainTitleDesc(String mainTitleDesc) {
    this.mainTitleDesc = mainTitleDesc;
    return this;
  }

  public TemplateCardBuilder emphasisContentTitle(String emphasisContentTitle) {
    this.emphasisContentTitle = emphasisContentTitle;
    return this;
  }

  public TemplateCardBuilder emphasisContentDesc(String emphasisContentDesc) {
    this.emphasisContentDesc = emphasisContentDesc;
    return this;
  }

  public TemplateCardBuilder subTitleText(String subTitleText) {
    this.subTitleText = subTitleText;
    return this;
  }

  public TemplateCardBuilder verticalContents(List<VerticalContent> verticalContents) {
    this.verticalContents = verticalContents;
    return this;
  }

  public TemplateCardBuilder horizontalContents(List<HorizontalContent> horizontalContents) {
    this.horizontalContents = horizontalContents;
    return this;
  }

  public TemplateCardBuilder jumps(List<TemplateCardJump> jumps) {
    this.jumps = jumps;
    return this;
  }

  public TemplateCardBuilder cardActionType(Integer cardActionType) {
    this.cardActionType = cardActionType;
    return this;
  }

  public TemplateCardBuilder cardActionUrl(String cardActionUrl) {
    this.cardActionUrl = cardActionUrl;
    return this;
  }

  public TemplateCardBuilder cardActionAppid(String cardActionAppid) {
    this.cardActionAppid = cardActionAppid;
    return this;
  }

  public TemplateCardBuilder cardActionPagepath(String cardActionPagepath) {
    this.cardActionPagepath = cardActionPagepath;
    return this;
  }

  public TemplateCardBuilder taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  public TemplateCardBuilder buttons(List<TemplateCardButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  public TemplateCardBuilder checkboxQuestionKey(String checkboxQuestionKey) {
    this.checkboxQuestionKey = checkboxQuestionKey;
    return this;
  }

  public TemplateCardBuilder checkboxMode(Integer checkboxMode) {
    this.checkboxMode = checkboxMode;
    return this;
  }

  public TemplateCardBuilder options(List<CheckboxOption> options) {
    this.options = options;
    return this;
  }

  public TemplateCardBuilder submitButtonText(String submitButtonText) {
    this.submitButtonText = submitButtonText;
    return this;
  }

  public TemplateCardBuilder submitButtonKey(String submitButtonKey) {
    this.submitButtonKey = submitButtonKey;
    return this;
  }

  public TemplateCardBuilder selects(List<MultipleSelect> selects) {
    this.selects = selects;
    return this;
  }

  public TemplateCardBuilder quoteArea(QuoteArea quoteArea) {
    this.quoteArea = quoteArea;
    return this;
  }

  @Override
  public WxCpMessage build() {
    WxCpMessage m = super.build();
    m.setSafe(null);
    m.setCardType(this.cardType);
    m.setSourceIconUrl(this.sourceIconUrl);
    m.setSourceDesc(this.sourceDesc);
    m.setMainTitleTitle(this.mainTitleTitle);
    m.setMainTitleDesc(this.mainTitleDesc);
    m.setCardImageUrl(this.cardImageUrl);
    m.setCardImageAspectRatio(this.cardImageAspectRatio);
    m.setEmphasisContentTitle(this.emphasisContentTitle);
    m.setEmphasisContentDesc(this.emphasisContentDesc);
    m.setSubTitleText(this.subTitleText);
    m.setVerticalContents(this.verticalContents);
    m.setHorizontalContents(this.horizontalContents);
    m.setJumps(this.jumps);
    m.setCardActionType(this.cardActionType);
    m.setCardActionAppid(this.cardActionAppid);
    m.setCardActionPagepath(this.cardActionPagepath);
    m.setCardActionUrl(this.cardActionUrl);
    m.setTaskId(this.taskId);
    m.setButtons(this.buttons);
    m.setCheckboxMode(this.checkboxMode);
    m.setCheckboxQuestionKey(this.checkboxQuestionKey);
    m.setOptions(this.options);
    m.setSubmitButtonText(this.submitButtonText);
    m.setSubmitButtonKey(this.submitButtonKey);
    m.setSelects(this.selects);
    m.setQuoteArea(this.quoteArea);
    return m;
  }
}
