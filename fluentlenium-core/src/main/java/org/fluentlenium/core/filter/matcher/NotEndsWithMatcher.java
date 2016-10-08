package org.fluentlenium.core.filter.matcher;

import java.util.regex.Pattern;

public class NotEndsWithMatcher extends AbstractMatcher {

    public NotEndsWithMatcher(final String value) {
        super(value);
    }

    public NotEndsWithMatcher(final Pattern value) {
        super(value);
    }

    @Override
    public MatcherType getMatcherType() {
        return MatcherType.NOT_END_WITH;
    }

    @Override
    public boolean isSatisfiedBy(final String obj) {
        return !CalculateService.endsWith(getPattern(), getValue(), obj);
    }

}
