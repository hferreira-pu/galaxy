package eu.lpinto.universe.api.dts;

import eu.lpinto.universe.api.dto.OrganizationDTO;
import eu.lpinto.universe.persistence.entities.Company;
import eu.lpinto.universe.persistence.entities.Organization;

/**
 * Clinic DTS - Data Transformation Object
 *
 * @author Rita Portas
 */
public class OrganizationDTS extends AbstractDTS<Organization, OrganizationDTO> {

    public static final OrganizationDTS T = new OrganizationDTS();

    @Override
    protected OrganizationDTO buildDTO(Organization entity) {
        if(entity == null) {
            return null;
        } else if(entity.isFull()) {
            return new OrganizationDTO(
                    entity.getCountry(),
                    entity.getClientID(),
                    entity.getClientSecret(),
                    entity.getEnable(),
                    entity.getEmail(),
                    entity.getFax(),
                    entity.getPhone(),
                    entity.getStreet(),
                    entity.getTown(),
                    entity.getZip(),
                    entity.getWebsite(),
                    AbstractDTS.toApiID(entity.getWorkers()),
                    AbstractDTS.toApiID(entity.getCompany()),
                    entity.getExternalID(),
                    entity.getCalendarID(),
                    AbstractDTS.toApiID(entity.getSelectedAvatar()),
                    AbstractDTS.toApiID(entity.getAvatars()),
                    entity.getCustomField(),
                    entity.getPreferences()
            );

        } else {
            return new OrganizationDTO(
                    entity.getCountry(),
                    entity.getClientID(),
                    entity.getClientSecret(),
                    entity.getEnable(),
                    entity.getEmail(),
                    entity.getFax(),
                    entity.getPhone(),
                    entity.getStreet(),
                    entity.getTown(),
                    entity.getZip(),
                    entity.getWebsite(),
                    null,
                    AbstractDTS.toApiID(entity.getCompany()),
                    entity.getExternalID(),
                    entity.getCalendarID(),
                    AbstractDTS.toApiID(entity.getSelectedAvatar()),
                    null,
                    entity.getCustomField(),
                    entity.getPreferences()
            );
        }
    }

    @Override
    public Organization toDomain(Long id) {
        if(id == null) {
            return null;
        }

        return new Organization(id);
    }

    @Override
    protected Organization buildEntity(OrganizationDTO dto) {
        return new Organization(
                dto.getCountry(),
                dto.getClientID(),
                dto.getClientSecret(),
                dto.getEnable(),
                dto.getEmail(),
                dto.getExternalID(),
                dto.getFax(),
                dto.getPhone(),
                dto.getStreet(),
                dto.getTown(),
                dto.getZip(),
                dto.getWebsite(),
                WorkerDTS.T.toEntitiesID(dto.getWorkers()),
                dto.getCompany() == null ? null : new Company(dto.getCompany()),
                dto.getCalendarID(),
                ImageDTS.T.toDomain(dto.getSelectedAvatar()),
                ImageDTS.T.toEntitiesID(dto.getAvatars()),
                dto.getCustomField(),
                dto.getPreferences(),
                dto.getName(),
                UserDTS.T.toDomain(dto.getCreator()),
                dto.getCreated(),
                UserDTS.T.toDomain(dto.getUpdater()),
                dto.getUpdated(),
                dto.getId());
    }
}
