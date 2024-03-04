package pie.ilikepiefoo.wrappergen.example;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public class ChildClassBuilder {
    public CeilingEntryObjectHandler ceilingEntryObjectHandler;
    public CeilingKeyObjectHandler ceilingKeyObjectHandler;
    public ClearHandler clearHandler;
    public CloneHandler cloneHandler;
    public ComparatorHandler comparatorHandler;
    public ComputeIfAbsentObjectFunctionHandler computeIfAbsentObjectFunctionHandler;
    public ComputeIfPresentObjectBiFunctionHandler computeIfPresentObjectBiFunctionHandler;
    public ComputeObjectBiFunctionHandler computeObjectBiFunctionHandler;
    public ContainsKeyObjectHandler containsKeyObjectHandler;
    public ContainsValueObjectHandler containsValueObjectHandler;
    public DescendingKeySetHandler descendingKeySetHandler;
    public DescendingMapHandler descendingMapHandler;
    public EntrySetHandler entrySetHandler;
    public EqualsObjectHandler equalsObjectHandler;
    public FirstEntryHandler firstEntryHandler;
    public FirstKeyHandler firstKeyHandler;
    public FloorEntryObjectHandler floorEntryObjectHandler;
    public FloorKeyObjectHandler floorKeyObjectHandler;
    public ForEachBiConsumerHandler forEachBiConsumerHandler;
    public GetObjectHandler getObjectHandler;
    public GetOrDefaultObjectObjectHandler getOrDefaultObjectObjectHandler;
    public HashCodeHandler hashCodeHandler;
    public HeadMapObjectBooleanHandler headMapObjectBooleanHandler;
    public HeadMapObjectHandler headMapObjectHandler;
    public HigherEntryObjectHandler higherEntryObjectHandler;
    public HigherKeyObjectHandler higherKeyObjectHandler;
    public IsEmptyHandler isEmptyHandler;
    public KeySetHandler keySetHandler;
    public LastEntryHandler lastEntryHandler;
    public LastKeyHandler lastKeyHandler;
    public LowerEntryObjectHandler lowerEntryObjectHandler;
    public LowerKeyObjectHandler lowerKeyObjectHandler;
    public MergeObjectObjectBiFunctionHandler mergeObjectObjectBiFunctionHandler;
    public NavigableKeySetHandler navigableKeySetHandler;
    public PollFirstEntryHandler pollFirstEntryHandler;
    public PollLastEntryHandler pollLastEntryHandler;
    public PutAllMapHandler putAllMapHandler;
    public PutIfAbsentObjectObjectHandler putIfAbsentObjectObjectHandler;
    public PutObjectObjectHandler putObjectObjectHandler;
    public RemoveObjectHandler removeObjectHandler;
    public RemoveObjectObjectHandler removeObjectObjectHandler;
    public ReplaceAllBiFunctionHandler replaceAllBiFunctionHandler;
    public ReplaceObjectObjectHandler replaceObjectObjectHandler;
    public ReplaceObjectObjectObjectHandler replaceObjectObjectObjectHandler;
    public SizeHandler sizeHandler;
    public SubMapObjectBooleanObjectBooleanHandler subMapObjectBooleanObjectBooleanHandler;
    public SubMapObjectObjectHandler subMapObjectObjectHandler;
    public TailMapObjectBooleanHandler tailMapObjectBooleanHandler;
    public TailMapObjectHandler tailMapObjectHandler;
    public ToStringHandler toStringHandler;
    public ValuesHandler valuesHandler;
    public ChildClassBuilder() {
    }

    public ChildClassBuilder setCeilingEntryObjectHandler(CeilingEntryObjectHandler ceilingEntryObjectHandler) {
        this.ceilingEntryObjectHandler = ceilingEntryObjectHandler;
        return this;
    }
    public ChildClassBuilder setCeilingKeyObjectHandler(CeilingKeyObjectHandler ceilingKeyObjectHandler) {
        this.ceilingKeyObjectHandler = ceilingKeyObjectHandler;
        return this;
    }
    public ChildClassBuilder setClearHandler(ClearHandler clearHandler) {
        this.clearHandler = clearHandler;
        return this;
    }
    public ChildClassBuilder setCloneHandler(CloneHandler cloneHandler) {
        this.cloneHandler = cloneHandler;
        return this;
    }
    public ChildClassBuilder setComparatorHandler(ComparatorHandler comparatorHandler) {
        this.comparatorHandler = comparatorHandler;
        return this;
    }
    public ChildClassBuilder setComputeIfAbsentObjectFunctionHandler(ComputeIfAbsentObjectFunctionHandler computeIfAbsentObjectFunctionHandler) {
        this.computeIfAbsentObjectFunctionHandler = computeIfAbsentObjectFunctionHandler;
        return this;
    }
    public ChildClassBuilder setComputeIfPresentObjectBiFunctionHandler(ComputeIfPresentObjectBiFunctionHandler computeIfPresentObjectBiFunctionHandler) {
        this.computeIfPresentObjectBiFunctionHandler = computeIfPresentObjectBiFunctionHandler;
        return this;
    }
    public ChildClassBuilder setComputeObjectBiFunctionHandler(ComputeObjectBiFunctionHandler computeObjectBiFunctionHandler) {
        this.computeObjectBiFunctionHandler = computeObjectBiFunctionHandler;
        return this;
    }
    public ChildClassBuilder setContainsKeyObjectHandler(ContainsKeyObjectHandler containsKeyObjectHandler) {
        this.containsKeyObjectHandler = containsKeyObjectHandler;
        return this;
    }
    public ChildClassBuilder setContainsValueObjectHandler(ContainsValueObjectHandler containsValueObjectHandler) {
        this.containsValueObjectHandler = containsValueObjectHandler;
        return this;
    }
    public ChildClassBuilder setDescendingKeySetHandler(DescendingKeySetHandler descendingKeySetHandler) {
        this.descendingKeySetHandler = descendingKeySetHandler;
        return this;
    }
    public ChildClassBuilder setDescendingMapHandler(DescendingMapHandler descendingMapHandler) {
        this.descendingMapHandler = descendingMapHandler;
        return this;
    }
    public ChildClassBuilder setEntrySetHandler(EntrySetHandler entrySetHandler) {
        this.entrySetHandler = entrySetHandler;
        return this;
    }
    public ChildClassBuilder setEqualsObjectHandler(EqualsObjectHandler equalsObjectHandler) {
        this.equalsObjectHandler = equalsObjectHandler;
        return this;
    }
    public ChildClassBuilder setFirstEntryHandler(FirstEntryHandler firstEntryHandler) {
        this.firstEntryHandler = firstEntryHandler;
        return this;
    }
    public ChildClassBuilder setFirstKeyHandler(FirstKeyHandler firstKeyHandler) {
        this.firstKeyHandler = firstKeyHandler;
        return this;
    }
    public ChildClassBuilder setFloorEntryObjectHandler(FloorEntryObjectHandler floorEntryObjectHandler) {
        this.floorEntryObjectHandler = floorEntryObjectHandler;
        return this;
    }
    public ChildClassBuilder setFloorKeyObjectHandler(FloorKeyObjectHandler floorKeyObjectHandler) {
        this.floorKeyObjectHandler = floorKeyObjectHandler;
        return this;
    }
    public ChildClassBuilder setForEachBiConsumerHandler(ForEachBiConsumerHandler forEachBiConsumerHandler) {
        this.forEachBiConsumerHandler = forEachBiConsumerHandler;
        return this;
    }
    public ChildClassBuilder setGetObjectHandler(GetObjectHandler getObjectHandler) {
        this.getObjectHandler = getObjectHandler;
        return this;
    }
    public ChildClassBuilder setGetOrDefaultObjectObjectHandler(GetOrDefaultObjectObjectHandler getOrDefaultObjectObjectHandler) {
        this.getOrDefaultObjectObjectHandler = getOrDefaultObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setHashCodeHandler(HashCodeHandler hashCodeHandler) {
        this.hashCodeHandler = hashCodeHandler;
        return this;
    }
    public ChildClassBuilder setHeadMapObjectBooleanHandler(HeadMapObjectBooleanHandler headMapObjectBooleanHandler) {
        this.headMapObjectBooleanHandler = headMapObjectBooleanHandler;
        return this;
    }
    public ChildClassBuilder setHeadMapObjectHandler(HeadMapObjectHandler headMapObjectHandler) {
        this.headMapObjectHandler = headMapObjectHandler;
        return this;
    }
    public ChildClassBuilder setHigherEntryObjectHandler(HigherEntryObjectHandler higherEntryObjectHandler) {
        this.higherEntryObjectHandler = higherEntryObjectHandler;
        return this;
    }
    public ChildClassBuilder setHigherKeyObjectHandler(HigherKeyObjectHandler higherKeyObjectHandler) {
        this.higherKeyObjectHandler = higherKeyObjectHandler;
        return this;
    }
    public ChildClassBuilder setIsEmptyHandler(IsEmptyHandler isEmptyHandler) {
        this.isEmptyHandler = isEmptyHandler;
        return this;
    }
    public ChildClassBuilder setKeySetHandler(KeySetHandler keySetHandler) {
        this.keySetHandler = keySetHandler;
        return this;
    }
    public ChildClassBuilder setLastEntryHandler(LastEntryHandler lastEntryHandler) {
        this.lastEntryHandler = lastEntryHandler;
        return this;
    }
    public ChildClassBuilder setLastKeyHandler(LastKeyHandler lastKeyHandler) {
        this.lastKeyHandler = lastKeyHandler;
        return this;
    }
    public ChildClassBuilder setLowerEntryObjectHandler(LowerEntryObjectHandler lowerEntryObjectHandler) {
        this.lowerEntryObjectHandler = lowerEntryObjectHandler;
        return this;
    }
    public ChildClassBuilder setLowerKeyObjectHandler(LowerKeyObjectHandler lowerKeyObjectHandler) {
        this.lowerKeyObjectHandler = lowerKeyObjectHandler;
        return this;
    }
    public ChildClassBuilder setMergeObjectObjectBiFunctionHandler(MergeObjectObjectBiFunctionHandler mergeObjectObjectBiFunctionHandler) {
        this.mergeObjectObjectBiFunctionHandler = mergeObjectObjectBiFunctionHandler;
        return this;
    }
    public ChildClassBuilder setNavigableKeySetHandler(NavigableKeySetHandler navigableKeySetHandler) {
        this.navigableKeySetHandler = navigableKeySetHandler;
        return this;
    }
    public ChildClassBuilder setPollFirstEntryHandler(PollFirstEntryHandler pollFirstEntryHandler) {
        this.pollFirstEntryHandler = pollFirstEntryHandler;
        return this;
    }
    public ChildClassBuilder setPollLastEntryHandler(PollLastEntryHandler pollLastEntryHandler) {
        this.pollLastEntryHandler = pollLastEntryHandler;
        return this;
    }
    public ChildClassBuilder setPutAllMapHandler(PutAllMapHandler putAllMapHandler) {
        this.putAllMapHandler = putAllMapHandler;
        return this;
    }
    public ChildClassBuilder setPutIfAbsentObjectObjectHandler(PutIfAbsentObjectObjectHandler putIfAbsentObjectObjectHandler) {
        this.putIfAbsentObjectObjectHandler = putIfAbsentObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setPutObjectObjectHandler(PutObjectObjectHandler putObjectObjectHandler) {
        this.putObjectObjectHandler = putObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setRemoveObjectHandler(RemoveObjectHandler removeObjectHandler) {
        this.removeObjectHandler = removeObjectHandler;
        return this;
    }
    public ChildClassBuilder setRemoveObjectObjectHandler(RemoveObjectObjectHandler removeObjectObjectHandler) {
        this.removeObjectObjectHandler = removeObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setReplaceAllBiFunctionHandler(ReplaceAllBiFunctionHandler replaceAllBiFunctionHandler) {
        this.replaceAllBiFunctionHandler = replaceAllBiFunctionHandler;
        return this;
    }
    public ChildClassBuilder setReplaceObjectObjectHandler(ReplaceObjectObjectHandler replaceObjectObjectHandler) {
        this.replaceObjectObjectHandler = replaceObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setReplaceObjectObjectObjectHandler(ReplaceObjectObjectObjectHandler replaceObjectObjectObjectHandler) {
        this.replaceObjectObjectObjectHandler = replaceObjectObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setSizeHandler(SizeHandler sizeHandler) {
        this.sizeHandler = sizeHandler;
        return this;
    }
    public ChildClassBuilder setSubMapObjectBooleanObjectBooleanHandler(SubMapObjectBooleanObjectBooleanHandler subMapObjectBooleanObjectBooleanHandler) {
        this.subMapObjectBooleanObjectBooleanHandler = subMapObjectBooleanObjectBooleanHandler;
        return this;
    }
    public ChildClassBuilder setSubMapObjectObjectHandler(SubMapObjectObjectHandler subMapObjectObjectHandler) {
        this.subMapObjectObjectHandler = subMapObjectObjectHandler;
        return this;
    }
    public ChildClassBuilder setTailMapObjectBooleanHandler(TailMapObjectBooleanHandler tailMapObjectBooleanHandler) {
        this.tailMapObjectBooleanHandler = tailMapObjectBooleanHandler;
        return this;
    }
    public ChildClassBuilder setTailMapObjectHandler(TailMapObjectHandler tailMapObjectHandler) {
        this.tailMapObjectHandler = tailMapObjectHandler;
        return this;
    }
    public ChildClassBuilder setToStringHandler(ToStringHandler toStringHandler) {
        this.toStringHandler = toStringHandler;
        return this;
    }
    public ChildClassBuilder setValuesHandler(ValuesHandler valuesHandler) {
        this.valuesHandler = valuesHandler;
        return this;
    }
    @FunctionalInterface
    public interface CeilingEntryObjectHandler {
        Entry<String, String> onCeilingEntry(String arg0);
    }

    @FunctionalInterface
    public interface CeilingKeyObjectHandler {
        String onCeilingKey(String arg0);
    }

    @FunctionalInterface
    public interface ClearHandler {
        void onClear();
    }

    @FunctionalInterface
    public interface CloneHandler {
        Object onClone();
    }

    @FunctionalInterface
    public interface ComparatorHandler {
        Comparator<? super String> onComparator();
    }

    @FunctionalInterface
    public interface ComputeIfAbsentObjectFunctionHandler {
        String onComputeIfAbsent(String arg0, Function<? super String, ? extends String> arg1);
    }

    @FunctionalInterface
    public interface ComputeIfPresentObjectBiFunctionHandler {
        String onComputeIfPresent(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1);
    }

    @FunctionalInterface
    public interface ComputeObjectBiFunctionHandler {
        String onCompute(String arg0, BiFunction<? super String, ? super String, ? extends String> arg1);
    }

    @FunctionalInterface
    public interface ContainsKeyObjectHandler {
        boolean onContainsKey(Object arg0);
    }

    @FunctionalInterface
    public interface ContainsValueObjectHandler {
        boolean onContainsValue(Object arg0);
    }

    @FunctionalInterface
    public interface DescendingKeySetHandler {
        NavigableSet<String> onDescendingKeySet();
    }

    @FunctionalInterface
    public interface DescendingMapHandler {
        NavigableMap<String, String> onDescendingMap();
    }

    @FunctionalInterface
    public interface EntrySetHandler {
        Set<Entry<String, String>> onEntrySet();
    }

    @FunctionalInterface
    public interface EqualsObjectHandler {
        boolean onEquals(Object arg0);
    }

    @FunctionalInterface
    public interface FirstEntryHandler {
        Entry<String, String> onFirstEntry();
    }

    @FunctionalInterface
    public interface FirstKeyHandler {
        String onFirstKey();
    }

    @FunctionalInterface
    public interface FloorEntryObjectHandler {
        Entry<String, String> onFloorEntry(String arg0);
    }

    @FunctionalInterface
    public interface FloorKeyObjectHandler {
        String onFloorKey(String arg0);
    }

    @FunctionalInterface
    public interface ForEachBiConsumerHandler {
        void onForEach(BiConsumer<? super String, ? super String> arg0);
    }

    @FunctionalInterface
    public interface GetObjectHandler {
        String onGet(Object arg0);
    }

    @FunctionalInterface
    public interface GetOrDefaultObjectObjectHandler {
        String onGetOrDefault(Object arg0, String arg1);
    }

    @FunctionalInterface
    public interface HashCodeHandler {
        int onHashCode();
    }

    @FunctionalInterface
    public interface HeadMapObjectBooleanHandler {
        NavigableMap<String, String> onHeadMap(String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface HeadMapObjectHandler {
        SortedMap<String, String> onHeadMap(String arg0);
    }

    @FunctionalInterface
    public interface HigherEntryObjectHandler {
        Entry<String, String> onHigherEntry(String arg0);
    }

    @FunctionalInterface
    public interface HigherKeyObjectHandler {
        String onHigherKey(String arg0);
    }

    @FunctionalInterface
    public interface IsEmptyHandler {
        boolean onIsEmpty();
    }

    @FunctionalInterface
    public interface KeySetHandler {
        Set<String> onKeySet();
    }

    @FunctionalInterface
    public interface LastEntryHandler {
        Entry<String, String> onLastEntry();
    }

    @FunctionalInterface
    public interface LastKeyHandler {
        String onLastKey();
    }

    @FunctionalInterface
    public interface LowerEntryObjectHandler {
        Entry<String, String> onLowerEntry(String arg0);
    }

    @FunctionalInterface
    public interface LowerKeyObjectHandler {
        String onLowerKey(String arg0);
    }

    @FunctionalInterface
    public interface MergeObjectObjectBiFunctionHandler {
        String onMerge(String arg0, String arg1, BiFunction<? super String, ? super String, ? extends String> arg2);
    }

    @FunctionalInterface
    public interface NavigableKeySetHandler {
        NavigableSet<String> onNavigableKeySet();
    }

    @FunctionalInterface
    public interface PollFirstEntryHandler {
        Entry<String, String> onPollFirstEntry();
    }

    @FunctionalInterface
    public interface PollLastEntryHandler {
        Entry<String, String> onPollLastEntry();
    }

    @FunctionalInterface
    public interface PutAllMapHandler {
        void onPutAll(Map<? extends String, ? extends String> arg0);
    }

    @FunctionalInterface
    public interface PutIfAbsentObjectObjectHandler {
        String onPutIfAbsent(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface PutObjectObjectHandler {
        String onPut(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface RemoveObjectHandler {
        String onRemove(Object arg0);
    }

    @FunctionalInterface
    public interface RemoveObjectObjectHandler {
        boolean onRemove(Object arg0, Object arg1);
    }

    @FunctionalInterface
    public interface ReplaceAllBiFunctionHandler {
        void onReplaceAll(BiFunction<? super String, ? super String, ? extends String> arg0);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectHandler {
        String onReplace(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface ReplaceObjectObjectObjectHandler {
        boolean onReplace(String arg0, String arg1, String arg2);
    }

    @FunctionalInterface
    public interface SizeHandler {
        int onSize();
    }

    @FunctionalInterface
    public interface SubMapObjectBooleanObjectBooleanHandler {
        NavigableMap<String, String> onSubMap(String arg0, boolean arg1, String arg2, boolean arg3);
    }

    @FunctionalInterface
    public interface SubMapObjectObjectHandler {
        SortedMap<String, String> onSubMap(String arg0, String arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectBooleanHandler {
        NavigableMap<String, String> onTailMap(String arg0, boolean arg1);
    }

    @FunctionalInterface
    public interface TailMapObjectHandler {
        SortedMap<String, String> onTailMap(String arg0);
    }

    @FunctionalInterface
    public interface ToStringHandler {
        String onToString();
    }

    @FunctionalInterface
    public interface ValuesHandler {
        Collection<String> onValues();
    }

}
