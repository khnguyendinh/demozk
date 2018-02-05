package khoand.demozk.models;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by quantri on 05/02/2018.
 */
@Entity
@Table(name = "USERS", schema = "VOFFICE_VPCP", catalog = "")
public class UsersEntity {
    private int userId;
    private String userName;
    private String password;
    private boolean status;
    private String email;
    private String cellphone;
    private String telephone;
    private String fax;
    private Boolean gender;
    private Time dateOfBirth;
    private Time lastChangePassword;
    private Time lastBlockDate;
    private boolean passwordExpireStatus;
    private Short loginFailureCount;
    private String urlImage;
    private String aliasName;
    private String birthPlace;
    private Short nationId;
    private Long typeOfWork;
    private String identityCard;
    private String issuePlaceIdent;
    private Time issueDateIdent;
    private String passportNumber;
    private String issuePlacePassport;
    private Time issueDatePassport;
    private Long religionId;
    private String nationality;
    private String nativeCountry;
    private String provinceCode;
    private String fullName;
    private String backupPassword;
    private Long ounId;
    private String cceId;
    private Long groId;
    private Boolean isOldData;
    private String appIds;
    private String appCodes;
    private String userDes;
    private Time createDate;

    @Id
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CELLPHONE")
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name = "TELEPHONE")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "GENDER")
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH")
    public Time getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "LAST_CHANGE_PASSWORD")
    public Time getLastChangePassword() {
        return lastChangePassword;
    }

    public void setLastChangePassword(Time lastChangePassword) {
        this.lastChangePassword = lastChangePassword;
    }

    @Basic
    @Column(name = "LAST_BLOCK_DATE")
    public Time getLastBlockDate() {
        return lastBlockDate;
    }

    public void setLastBlockDate(Time lastBlockDate) {
        this.lastBlockDate = lastBlockDate;
    }

    @Basic
    @Column(name = "PASSWORD_EXPIRE_STATUS")
    public boolean isPasswordExpireStatus() {
        return passwordExpireStatus;
    }

    public void setPasswordExpireStatus(boolean passwordExpireStatus) {
        this.passwordExpireStatus = passwordExpireStatus;
    }

    @Basic
    @Column(name = "LOGIN_FAILURE_COUNT")
    public Short getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Short loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    @Basic
    @Column(name = "URL_IMAGE")
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Basic
    @Column(name = "ALIAS_NAME")
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    @Basic
    @Column(name = "BIRTH_PLACE")
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Basic
    @Column(name = "NATION_ID")
    public Short getNationId() {
        return nationId;
    }

    public void setNationId(Short nationId) {
        this.nationId = nationId;
    }

    @Basic
    @Column(name = "TYPE_OF_WORK")
    public Long getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(Long typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    @Basic
    @Column(name = "IDENTITY_CARD")
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Basic
    @Column(name = "ISSUE_PLACE_IDENT")
    public String getIssuePlaceIdent() {
        return issuePlaceIdent;
    }

    public void setIssuePlaceIdent(String issuePlaceIdent) {
        this.issuePlaceIdent = issuePlaceIdent;
    }

    @Basic
    @Column(name = "ISSUE_DATE_IDENT")
    public Time getIssueDateIdent() {
        return issueDateIdent;
    }

    public void setIssueDateIdent(Time issueDateIdent) {
        this.issueDateIdent = issueDateIdent;
    }

    @Basic
    @Column(name = "PASSPORT_NUMBER")
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "ISSUE_PLACE_PASSPORT")
    public String getIssuePlacePassport() {
        return issuePlacePassport;
    }

    public void setIssuePlacePassport(String issuePlacePassport) {
        this.issuePlacePassport = issuePlacePassport;
    }

    @Basic
    @Column(name = "ISSUE_DATE_PASSPORT")
    public Time getIssueDatePassport() {
        return issueDatePassport;
    }

    public void setIssueDatePassport(Time issueDatePassport) {
        this.issueDatePassport = issueDatePassport;
    }

    @Basic
    @Column(name = "RELIGION_ID")
    public Long getReligionId() {
        return religionId;
    }

    public void setReligionId(Long religionId) {
        this.religionId = religionId;
    }

    @Basic
    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "NATIVE_COUNTRY")
    public String getNativeCountry() {
        return nativeCountry;
    }

    public void setNativeCountry(String nativeCountry) {
        this.nativeCountry = nativeCountry;
    }

    @Basic
    @Column(name = "PROVINCE_CODE")
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "BACKUP_PASSWORD")
    public String getBackupPassword() {
        return backupPassword;
    }

    public void setBackupPassword(String backupPassword) {
        this.backupPassword = backupPassword;
    }

    @Basic
    @Column(name = "OUN_ID")
    public Long getOunId() {
        return ounId;
    }

    public void setOunId(Long ounId) {
        this.ounId = ounId;
    }

    @Basic
    @Column(name = "CCE_ID")
    public String getCceId() {
        return cceId;
    }

    public void setCceId(String cceId) {
        this.cceId = cceId;
    }

    @Basic
    @Column(name = "GRO_ID")
    public Long getGroId() {
        return groId;
    }

    public void setGroId(Long groId) {
        this.groId = groId;
    }

    @Basic
    @Column(name = "IS_OLD_DATA")
    public Boolean getOldData() {
        return isOldData;
    }

    public void setOldData(Boolean oldData) {
        isOldData = oldData;
    }

    @Basic
    @Column(name = "APP_IDS")
    public String getAppIds() {
        return appIds;
    }

    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    @Basic
    @Column(name = "APP_CODES")
    public String getAppCodes() {
        return appCodes;
    }

    public void setAppCodes(String appCodes) {
        this.appCodes = appCodes;
    }

    @Basic
    @Column(name = "USER_DES")
    public String getUserDes() {
        return userDes;
    }

    public void setUserDes(String userDes) {
        this.userDes = userDes;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public Time getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (status != that.status) return false;
        if (passwordExpireStatus != that.passwordExpireStatus) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (lastChangePassword != null ? !lastChangePassword.equals(that.lastChangePassword) : that.lastChangePassword != null)
            return false;
        if (lastBlockDate != null ? !lastBlockDate.equals(that.lastBlockDate) : that.lastBlockDate != null)
            return false;
        if (loginFailureCount != null ? !loginFailureCount.equals(that.loginFailureCount) : that.loginFailureCount != null)
            return false;
        if (urlImage != null ? !urlImage.equals(that.urlImage) : that.urlImage != null) return false;
        if (aliasName != null ? !aliasName.equals(that.aliasName) : that.aliasName != null) return false;
        if (birthPlace != null ? !birthPlace.equals(that.birthPlace) : that.birthPlace != null) return false;
        if (nationId != null ? !nationId.equals(that.nationId) : that.nationId != null) return false;
        if (typeOfWork != null ? !typeOfWork.equals(that.typeOfWork) : that.typeOfWork != null) return false;
        if (identityCard != null ? !identityCard.equals(that.identityCard) : that.identityCard != null) return false;
        if (issuePlaceIdent != null ? !issuePlaceIdent.equals(that.issuePlaceIdent) : that.issuePlaceIdent != null)
            return false;
        if (issueDateIdent != null ? !issueDateIdent.equals(that.issueDateIdent) : that.issueDateIdent != null)
            return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (issuePlacePassport != null ? !issuePlacePassport.equals(that.issuePlacePassport) : that.issuePlacePassport != null)
            return false;
        if (issueDatePassport != null ? !issueDatePassport.equals(that.issueDatePassport) : that.issueDatePassport != null)
            return false;
        if (religionId != null ? !religionId.equals(that.religionId) : that.religionId != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (nativeCountry != null ? !nativeCountry.equals(that.nativeCountry) : that.nativeCountry != null)
            return false;
        if (provinceCode != null ? !provinceCode.equals(that.provinceCode) : that.provinceCode != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (backupPassword != null ? !backupPassword.equals(that.backupPassword) : that.backupPassword != null)
            return false;
        if (ounId != null ? !ounId.equals(that.ounId) : that.ounId != null) return false;
        if (cceId != null ? !cceId.equals(that.cceId) : that.cceId != null) return false;
        if (groId != null ? !groId.equals(that.groId) : that.groId != null) return false;
        if (isOldData != null ? !isOldData.equals(that.isOldData) : that.isOldData != null) return false;
        if (appIds != null ? !appIds.equals(that.appIds) : that.appIds != null) return false;
        if (appCodes != null ? !appCodes.equals(that.appCodes) : that.appCodes != null) return false;
        if (userDes != null ? !userDes.equals(that.userDes) : that.userDes != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (lastChangePassword != null ? lastChangePassword.hashCode() : 0);
        result = 31 * result + (lastBlockDate != null ? lastBlockDate.hashCode() : 0);
        result = 31 * result + (passwordExpireStatus ? 1 : 0);
        result = 31 * result + (loginFailureCount != null ? loginFailureCount.hashCode() : 0);
        result = 31 * result + (urlImage != null ? urlImage.hashCode() : 0);
        result = 31 * result + (aliasName != null ? aliasName.hashCode() : 0);
        result = 31 * result + (birthPlace != null ? birthPlace.hashCode() : 0);
        result = 31 * result + (nationId != null ? nationId.hashCode() : 0);
        result = 31 * result + (typeOfWork != null ? typeOfWork.hashCode() : 0);
        result = 31 * result + (identityCard != null ? identityCard.hashCode() : 0);
        result = 31 * result + (issuePlaceIdent != null ? issuePlaceIdent.hashCode() : 0);
        result = 31 * result + (issueDateIdent != null ? issueDateIdent.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (issuePlacePassport != null ? issuePlacePassport.hashCode() : 0);
        result = 31 * result + (issueDatePassport != null ? issueDatePassport.hashCode() : 0);
        result = 31 * result + (religionId != null ? religionId.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (nativeCountry != null ? nativeCountry.hashCode() : 0);
        result = 31 * result + (provinceCode != null ? provinceCode.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (backupPassword != null ? backupPassword.hashCode() : 0);
        result = 31 * result + (ounId != null ? ounId.hashCode() : 0);
        result = 31 * result + (cceId != null ? cceId.hashCode() : 0);
        result = 31 * result + (groId != null ? groId.hashCode() : 0);
        result = 31 * result + (isOldData != null ? isOldData.hashCode() : 0);
        result = 31 * result + (appIds != null ? appIds.hashCode() : 0);
        result = 31 * result + (appCodes != null ? appCodes.hashCode() : 0);
        result = 31 * result + (userDes != null ? userDes.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
