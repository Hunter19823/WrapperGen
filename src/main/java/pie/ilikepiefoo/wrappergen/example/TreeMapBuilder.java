package pie.ilikepiefoo.wrappergen.example;

public class TreeMapBuilder<K, V> {
    public CeilingEntryObjectHandler<K, V> ceilingEntryObjectHandler;
    public CeilingKeyObjectHandler<K> ceilingKeyObjectHandler;
    public ClearHandler clearHandler;
    public CloneHandler cloneHandler;
    public ComparatorHandler<K> comparatorHandler;
    public ComputeIfAbsentObjectFunctionHandler<K, V> computeIfAbsentObjectFunctionHandler;
    public ComputeIfPresentObjectBiFunctionHandler<K, V> computeIfPresentObjectBiFunctionHandler;
    public ComputeObjectBiFunctionHandler<K, V> computeObjectBiFunctionHandler;
    public ContainsKeyObjectHandler containsKeyObjectHandler;
    public ContainsValueObjectHandler containsValueObjectHandler;
    public DescendingKeySetHandler<K> descendingKeySetHandler;
    public DescendingMapHandler<V, K> descendingMapHandler;
    public EntrySetHandler<V, K> entrySetHandler;
    public EqualsObjectHandler equalsObjectHandler;
    public FirstEntryHandler<V, K> firstEntryHandler;
    public FirstKeyHandler<K> firstKeyHandler;
    public FloorEntryObjectHandler<K, V> floorEntryObjectHandler;
    public FloorKeyObjectHandler<K> floorKeyObjectHandler;
    public ForEachBiConsumerHandler<V, K> forEachBiConsumerHandler;
    public GetObjectHandler<V> getObjectHandler;
    public GetOrDefaultObjectObjectHandler<V> getOrDefaultObjectObjectHandler;
    public HashCodeHandler hashCodeHandler;
    public HeadMapObjectBooleanHandler<K, V> headMapObjectBooleanHandler;
    public HeadMapObjectHandler<K, V> headMapObjectHandler;
    public HigherEntryObjectHandler<K, V> higherEntryObjectHandler;
    public HigherKeyObjectHandler<K> higherKeyObjectHandler;
    public IsEmptyHandler isEmptyHandler;
    public KeySetHandler<K> keySetHandler;
    public LastEntryHandler<V, K> lastEntryHandler;
    public LastKeyHandler<K> lastKeyHandler;
    public LowerEntryObjectHandler<K, V> lowerEntryObjectHandler;
    public LowerKeyObjectHandler<K> lowerKeyObjectHandler;
    public MergeObjectObjectBiFunctionHandler<K, V> mergeObjectObjectBiFunctionHandler;
    public NavigableKeySetHandler<K> navigableKeySetHandler;
    public PollFirstEntryHandler<V, K> pollFirstEntryHandler;
    public PollLastEntryHandler<V, K> pollLastEntryHandler;
    public PutAllMapHandler<V, K> putAllMapHandler;
    public PutIfAbsentObjectObjectHandler<K, V> putIfAbsentObjectObjectHandler;
    public PutObjectObjectHandler<K, V> putObjectObjectHandler;
    public RemoveObjectHandler<V> removeObjectHandler;
    public RemoveObjectObjectHandler removeObjectObjectHandler;
    public ReplaceAllBiFunctionHandler<V, K> replaceAllBiFunctionHandler;
    public ReplaceObjectObjectHandler<K, V> replaceObjectObjectHandler;
    public ReplaceObjectObjectObjectHandler<K, V> replaceObjectObjectObjectHandler;
    public SizeHandler sizeHandler;
    public SubMapObjectBooleanObjectBooleanHandler<K, V> subMapObjectBooleanObjectBooleanHandler;
    public SubMapObjectObjectHandler<K, V> subMapObjectObjectHandler;
    public TailMapObjectBooleanHandler<K, V> tailMapObjectBooleanHandler;
    public TailMapObjectHandler<K, V> tailMapObjectHandler;
    public ToStringHandler toStringHandler;
    public ValuesHandler<V> valuesHandler;
    public TreeMapBuilder() {
    }

    public TreeMapBuilder<K, V> setCeilingEntryObjectHandler(CeilingEntryObjectHandler<K, V> ceilingEntryObjectHandler) {
        this.ceilingEntryObjectHandler = ceilingEntryObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setCeilingKeyObjectHandler(CeilingKeyObjectHandler<K> ceilingKeyObjectHandler) {
        this.ceilingKeyObjectHandler = ceilingKeyObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setClearHandler(ClearHandler clearHandler) {
        this.clearHandler = clearHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setCloneHandler(CloneHandler cloneHandler) {
        this.cloneHandler = cloneHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setComparatorHandler(ComparatorHandler<K> comparatorHandler) {
        this.comparatorHandler = comparatorHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setComputeIfAbsentObjectFunctionHandler(ComputeIfAbsentObjectFunctionHandler<K, V> computeIfAbsentObjectFunctionHandler) {
        this.computeIfAbsentObjectFunctionHandler = computeIfAbsentObjectFunctionHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setComputeIfPresentObjectBiFunctionHandler(ComputeIfPresentObjectBiFunctionHandler<K, V> computeIfPresentObjectBiFunctionHandler) {
        this.computeIfPresentObjectBiFunctionHandler = computeIfPresentObjectBiFunctionHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setComputeObjectBiFunctionHandler(ComputeObjectBiFunctionHandler<K, V> computeObjectBiFunctionHandler) {
        this.computeObjectBiFunctionHandler = computeObjectBiFunctionHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setContainsKeyObjectHandler(ContainsKeyObjectHandler containsKeyObjectHandler) {
        this.containsKeyObjectHandler = containsKeyObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setContainsValueObjectHandler(ContainsValueObjectHandler containsValueObjectHandler) {
        this.containsValueObjectHandler = containsValueObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setDescendingKeySetHandler(DescendingKeySetHandler<K> descendingKeySetHandler) {
        this.descendingKeySetHandler = descendingKeySetHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setDescendingMapHandler(DescendingMapHandler<V, K> descendingMapHandler) {
        this.descendingMapHandler = descendingMapHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setEntrySetHandler(EntrySetHandler<V, K> entrySetHandler) {
        this.entrySetHandler = entrySetHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setFirstEntryHandler(FirstEntryHandler<V, K> firstEntryHandler) {
        this.firstEntryHandler = firstEntryHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setFirstKeyHandler(FirstKeyHandler<K> firstKeyHandler) {
        this.firstKeyHandler = firstKeyHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setFloorEntryObjectHandler(FloorEntryObjectHandler<K, V> floorEntryObjectHandler) {
        this.floorEntryObjectHandler = floorEntryObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setFloorKeyObjectHandler(FloorKeyObjectHandler<K> floorKeyObjectHandler) {
        this.floorKeyObjectHandler = floorKeyObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setForEachBiConsumerHandler(ForEachBiConsumerHandler<V, K> forEachBiConsumerHandler) {
        this.forEachBiConsumerHandler = forEachBiConsumerHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setGetObjectHandler(GetObjectHandler<V> getObjectHandler) {
        this.getObjectHandler = getObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setGetOrDefaultObjectObjectHandler(GetOrDefaultObjectObjectHandler<V> getOrDefaultObjectObjectHandler) {
        this.getOrDefaultObjectObjectHandler = getOrDefaultObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setHeadMapObjectBooleanHandler(HeadMapObjectBooleanHandler<K, V> headMapObjectBooleanHandler) {
        this.headMapObjectBooleanHandler = headMapObjectBooleanHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setHeadMapObjectHandler(HeadMapObjectHandler<K, V> headMapObjectHandler) {
        this.headMapObjectHandler = headMapObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setHigherEntryObjectHandler(HigherEntryObjectHandler<K, V> higherEntryObjectHandler) {
        this.higherEntryObjectHandler = higherEntryObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setHigherKeyObjectHandler(HigherKeyObjectHandler<K> higherKeyObjectHandler) {
        this.higherKeyObjectHandler = higherKeyObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setIsEmptyHandler(IsEmptyHandler isEmptyHandler) {
        this.isEmptyHandler = isEmptyHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setKeySetHandler(KeySetHandler<K> keySetHandler) {
        this.keySetHandler = keySetHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setLastEntryHandler(LastEntryHandler<V, K> lastEntryHandler) {
        this.lastEntryHandler = lastEntryHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setLastKeyHandler(LastKeyHandler<K> lastKeyHandler) {
        this.lastKeyHandler = lastKeyHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setLowerEntryObjectHandler(LowerEntryObjectHandler<K, V> lowerEntryObjectHandler) {
        this.lowerEntryObjectHandler = lowerEntryObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setLowerKeyObjectHandler(LowerKeyObjectHandler<K> lowerKeyObjectHandler) {
        this.lowerKeyObjectHandler = lowerKeyObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setMergeObjectObjectBiFunctionHandler(MergeObjectObjectBiFunctionHandler<K, V> mergeObjectObjectBiFunctionHandler) {
        this.mergeObjectObjectBiFunctionHandler = mergeObjectObjectBiFunctionHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setNavigableKeySetHandler(NavigableKeySetHandler<K> navigableKeySetHandler) {
        this.navigableKeySetHandler = navigableKeySetHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setPollFirstEntryHandler(PollFirstEntryHandler<V, K> pollFirstEntryHandler) {
        this.pollFirstEntryHandler = pollFirstEntryHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setPollLastEntryHandler(PollLastEntryHandler<V, K> pollLastEntryHandler) {
        this.pollLastEntryHandler = pollLastEntryHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setPutAllMapHandler(PutAllMapHandler<V, K> putAllMapHandler) {
        this.putAllMapHandler = putAllMapHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setPutIfAbsentObjectObjectHandler(PutIfAbsentObjectObjectHandler<K, V> putIfAbsentObjectObjectHandler) {
        this.putIfAbsentObjectObjectHandler = putIfAbsentObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setPutObjectObjectHandler(PutObjectObjectHandler<K, V> putObjectObjectHandler) {
        this.putObjectObjectHandler = putObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setRemoveObjectHandler(RemoveObjectHandler<V> removeObjectHandler) {
        this.removeObjectHandler = removeObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setRemoveObjectObjectHandler(RemoveObjectObjectHandler removeObjectObjectHandler) {
        this.removeObjectObjectHandler = removeObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setReplaceAllBiFunctionHandler(ReplaceAllBiFunctionHandler<V, K> replaceAllBiFunctionHandler) {
        this.replaceAllBiFunctionHandler = replaceAllBiFunctionHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setReplaceObjectObjectHandler(ReplaceObjectObjectHandler<K, V> replaceObjectObjectHandler) {
        this.replaceObjectObjectHandler = replaceObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setReplaceObjectObjectObjectHandler(ReplaceObjectObjectObjectHandler<K, V> replaceObjectObjectObjectHandler) {
        this.replaceObjectObjectObjectHandler = replaceObjectObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setSizeHandler(SizeHandler sizeHandler) {
        this.sizeHandler = sizeHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setSubMapObjectBooleanObjectBooleanHandler(SubMapObjectBooleanObjectBooleanHandler<K, V> subMapObjectBooleanObjectBooleanHandler) {
        this.subMapObjectBooleanObjectBooleanHandler = subMapObjectBooleanObjectBooleanHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setSubMapObjectObjectHandler(SubMapObjectObjectHandler<K, V> subMapObjectObjectHandler) {
        this.subMapObjectObjectHandler = subMapObjectObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setTailMapObjectBooleanHandler(TailMapObjectBooleanHandler<K, V> tailMapObjectBooleanHandler) {
        this.tailMapObjectBooleanHandler = tailMapObjectBooleanHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setTailMapObjectHandler(TailMapObjectHandler<K, V> tailMapObjectHandler) {
        this.tailMapObjectHandler = tailMapObjectHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }
    public TreeMapBuilder<K, V> setValuesHandler(ValuesHandler<V> valuesHandler) {
        this.valuesHandler = valuesHandler;
        return this;
    }
    @FunctionalInterface
    public interface CeilingEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onCeilingEntry(K arg0);
    }

    @FunctionalInterface
    public interface CeilingKeyObjectHandler<K> {
        K onCeilingKey(K arg0);
    }

    @FunctionalInterface
    public interface ClearHandler {
        void onClear();
    }

    @FunctionalInterface
    public interface CloneHandler {
        java.lang.Object onClone();
    }

    @FunctionalInterface
    public interface ComparatorHandler<K> {
        java.util.Comparator<? super K> onComparator();
    }

    @FunctionalInterface
    public interface ComputeIfAbsentObjectFunctionHandler<K, V> {
        V onComputeIfAbsent(K arg0, java.util.function.Function<? super K, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler<K, V> {
        V onComputeIfPresent(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler<K, V> {
        V onCompute(K arg0, java.util.function.BiFunction<? super K, ? super V, ? extends V> arg1);
    }

    @FunctionalInterface
    public interface ContainsKeyObjectHandler {
        boolean onContainsKey(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface ContainsValueObjectHandler {
        boolean onContainsValue(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface DescendingKeySetHandler<K> {
        java.util.NavigableSet<K> onDescendingKeySet();
    }

    @FunctionalInterface
    public interface DescendingMapHandler<V, K> {
        java.util.NavigableMap<K, V> onDescendingMap();
    }

    @FunctionalInterface
    public interface EntrySetHandler<V, K> {
        java.util.Set<java.util.Map.Entry<K, V>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface FirstEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onFirstEntry();
    }

    @FunctionalInterface
    public interface FirstKeyHandler<K> {
        K onFirstKey();
    }

    @FunctionalInterface
    public interface FloorEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onFloorEntry(K arg0);
    }

    @FunctionalInterface
    public interface FloorKeyObjectHandler<K> {
        K onFloorKey(K arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler<V, K> {
        void onForEach(java.util.function.BiConsumer<? super K, ? super V> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler<V> {
        V onGet(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler<V> {
        V onGetOrDefault(java.lang.Object arg0, V arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface HeadMapObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onHeadMap(K arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onHeadMap(K arg0);
    }

    @FunctionalInterface
    public interface HigherEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onHigherEntry(K arg0);
    }

    @FunctionalInterface
    public interface HigherKeyObjectHandler<K> {
        K onHigherKey(K arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler<K> {
        java.util.Set<K> onKeySet();
    }

    @FunctionalInterface
    public interface LastEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onLastEntry();
    }

    @FunctionalInterface
    public interface LastKeyHandler<K> {
        K onLastKey();
    }

    @FunctionalInterface
    public interface LowerEntryObjectHandler<K, V> {
        java.util.Map.Entry<K, V> onLowerEntry(K arg0);
    }

    @FunctionalInterface
    public interface LowerKeyObjectHandler<K> {
        K onLowerKey(K arg0);
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler<K, V> {
        V onMerge(K arg0, V arg1, java.util.function.BiFunction<? super V, ? super V, ? extends V> arg2);
    }

    @FunctionalInterface
    public interface NavigableKeySetHandler<K> {
        java.util.NavigableSet<K> onNavigableKeySet();
    }

    @FunctionalInterface
    public interface PollFirstEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onPollFirstEntry();
    }

    @FunctionalInterface
    public interface PollLastEntryHandler<V, K> {
        java.util.Map.Entry<K, V> onPollLastEntry();
    }

    @FunctionalInterface
    public interface PutAllMapHandler<V, K> {
        void onPutAll(java.util.Map<? extends K, ? extends V> arg0);
    }

    @FunctionalInterface
    public interface PutIfAbsentObjectObjectHandler<K, V> {
        V onPutIfAbsent(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface PutObjectObjectHandler<K, V> {
        V onPut(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler<V> {
        V onRemove(java.lang.Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(java.lang.Object arg0, java.lang.Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler<V, K> {
        void onReplaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> arg0);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectHandler<K, V> {
        V onReplace(K arg0, V arg1);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectObjectHandler<K, V> {
        boolean onReplace(K arg0, V arg1, V arg2);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SubMapObjectBooleanObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onSubMap(K arg0, boolean arg1, K arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler<K, V> {
        java.util.SortedMap<K, V> onSubMap(K arg0, K arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectBooleanHandler<K, V> {
        java.util.NavigableMap<K, V> onTailMap(K arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler<K, V> {
        java.util.SortedMap<K, V> onTailMap(K arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        java.lang.String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler<V> {
        java.util.Collection<V> onValues();
    }

}
