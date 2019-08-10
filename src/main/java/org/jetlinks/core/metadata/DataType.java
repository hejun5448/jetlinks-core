package org.jetlinks.core.metadata;

import java.util.Map;

/**
 * @author zhouhao
 * @since 1.0.0
 */
public interface DataType extends Metadata, Formattable {

    ValidateResult validate(Object value);

    @Override
    default Map<String, Object> getExpands() {
        return null;
    }

}
