package org.infinispan.eviction;

import java.util.Map;

import net.jcip.annotations.ThreadSafe;

import org.infinispan.container.entries.InternalCacheEntry;
import org.infinispan.expiration.ExpirationManager;
import org.infinispan.factories.scopes.Scope;
import org.infinispan.factories.scopes.Scopes;

/**
 * Central component that deals with eviction of cache entries.
 * <p />
 * This manager only controls notifications of when entries are evicted.
 * <p />
 * @author Manik Surtani
 * @since 4.0
 */
@ThreadSafe
@Scope(Scopes.NAMED_CACHE)
public interface EvictionManager<K, V> {
   /**
    * Handles notifications of evicted entries
    * @param evicted The entries that were just evicted
    */
   void onEntryEviction(Map<? extends K, InternalCacheEntry<? extends K, ? extends V>> evicted);
}
