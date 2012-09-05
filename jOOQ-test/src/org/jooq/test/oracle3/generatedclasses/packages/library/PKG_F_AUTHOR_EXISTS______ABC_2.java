/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PKG_F_AUTHOR_EXISTS______ABC_2 extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -942619950;


	/**
	 * The procedure parameter <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS.AUTHOR_NAME</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS.UNUSED</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> UNUSED = createParameter("UNUSED", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PKG_F_AUTHOR_EXISTS______ABC_2() {
		super("PKG_F_AUTHOR_EXISTS", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.packages.LIBRARY.LIBRARY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(AUTHOR_NAME);
		addInParameter(UNUSED);
		setOverloaded(true);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAUTHOR_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2.AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setAUTHOR_NAME(org.jooq.Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}

	/**
	 * Set the <code>UNUSED</code> parameter IN value to the routine
	 */
	public void setUNUSED(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2.UNUSED, value);
	}

	/**
	 * Set the <code>UNUSED</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setUNUSED(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(UNUSED, field);
	}
}