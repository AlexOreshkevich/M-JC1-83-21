package by.academy.jc.ht.shorokhov.ht13;


import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ImmutableSetCollector<T>
        implements Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>> {

    @Override
    public Supplier<ImmutableSet.Builder<T>> supplier() {
        return ImmutableSet::builder;
    }

    @Override
    public BiConsumer<ImmutableSet.Builder<T>, T> accumulator() {
        return ImmutableSet.Builder::add;
    }

    @Override
    public BinaryOperator<ImmutableSet.Builder<T>> combiner() {
        return (left, right) -> left.addAll(right.build());
    }

    @Override
    public Function<ImmutableSet.Builder<T>, ImmutableSet<T>> finisher() {
        return ImmutableSet.Builder::build;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Sets.immutableEnumSet(Characteristics.UNORDERED);
    }

    public static <T> ImmutableSetCollector<T> toImmutableSet() {
        return new ImmutableSetCollector<>();
    }
}













/*
public class ImmutableSetCollector<String>
        implements Collector<String, Set<String>, HashSet<String>> {

    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, String> accumulator() {
        return Set::add;
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (left, right) -> Stream.concat(left.stream(), right.stream()).collect(Collectors.toCollection(HashSet::new));
    }

    @Override
    public Function<Set<String>, HashSet<String>> finisher() {
        return HashSet::new;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Sets.immutableEnumSet(Characteristics.CONCURRENT);
    }

    public static <String> ImmutableSetCollector<String> toImmutableSet() {
        return new ImmutableSetCollector<>();
    }
}
*/