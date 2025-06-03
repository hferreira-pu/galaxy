package eu.lpinto.universe.api.dts;

import eu.lpinto.universe.persistence.entities.Company;

/**
 * Company DTO - Data Transformation Object
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class CompanyDTS extends AbstractDTS<Company, eu.lpinto.universe.api.dto.Company> {

    public static final CompanyDTS T = new CompanyDTS();

    @Override
    protected eu.lpinto.universe.api.dto.Company buildDTO(Company entity) {
        if(entity == null) {
            return null;
        }

        if(entity.isFull()) {
            return new eu.lpinto.universe.api.dto.Company(
                    entity.getPhone(),
                    entity.getFacebook(),
                    entity.getEmail(),
                    entity.getVatNumber(),
                    entity.getCustomField(),
                    entity.getStreet(),
                    entity.getZip(),
                    entity.getTown(),
                    entity.getCountry(),
                    ImageDTS.toApiID(entity.getSelectedAvatar()),
                    CompanyDTS.toApiID(entity.getParent()),
                    entity.getPreferences()
            );

        } else {
            return new eu.lpinto.universe.api.dto.Company(
                    entity.getPhone(),
                    entity.getFacebook(),
                    entity.getEmail(),
                    entity.getVatNumber(),
                    entity.getCustomField(),
                    entity.getStreet(),
                    entity.getZip(),
                    entity.getTown(),
                    entity.getCountry(),
                    null,
                    null,
                    entity.getPreferences()
            );
        }
    }

    @Override
    public Company toDomain(Long id) {
        if(id == null) {
            return null;
        }

        return new Company(id);
    }

    @Override
    protected Company buildEntity(eu.lpinto.universe.api.dto.Company dto) {
        return new Company(dto.getPhone(),
                           dto.getFacebook(),
                           dto.getEmail(),
                           dto.getVatNumber(),
                           dto.getCustomField(),
                           dto.getStreet(),
                           dto.getZip(),
                           dto.getTown(),
                           dto.getCountry(),
                           ImageDTS.T.toDomain(dto.getAvatar()),
                           CompanyDTS.T.toDomain(dto.getParent()),
                           dto.getPreferences());
    }
}
