/*
 * (C) Copyright 2003-2017, by Barak Naveh and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht;

/**
 * A graph whose all edges are directed. This is the root interface of all directed graphs.
 *
 * <p>
 * See <a href="http://mathworld.wolfram.com/DirectedGraph.html">
 * http://mathworld.wolfram.com/DirectedGraph.html</a> for more on directed graphs.
 * </p>
 *
 * @param <V> the graph vertex type
 * @param <E> the graph edge type
 *
 * @author Barak Naveh
 * @since Jul 14, 2003
 * @deprecated In favor of {@link Graph}.
 */
@Deprecated
public interface DirectedGraph<V, E>
    extends Graph<V, E>
{
}

// End DirectedGraph.java
