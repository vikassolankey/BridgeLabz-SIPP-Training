import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return String.format("Policy[%s, %s, %s, %s, %.2f]", policyNumber, policyholderName, expiryDate, coverageType, premiumAmount);
    }
}

class PolicyManager {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    private Map<String, Integer> policyNumberCount = new HashMap<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
        policyNumberCount.put(policy.getPolicyNumber(), policyNumberCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
    }

    public void removePolicy(Policy policy) {
        hashSet.remove(policy);
        linkedHashSet.remove(policy);
        treeSet.remove(policy);
        policyNumberCount.put(policy.getPolicyNumber(), policyNumberCount.getOrDefault(policy.getPolicyNumber(), 1) - 1);
    }

    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    public List<Policy> getPoliciesExpiringSoon(int days) {
        LocalDate now = LocalDate.now();
        LocalDate soon = now.plusDays(days);
        List<Policy> result = new ArrayList<>();
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(soon) && !p.getExpiryDate().isBefore(now)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Policy> getDuplicatePolicies() {
        List<Policy> duplicates = new ArrayList<>();
        for (Policy p : hashSet) {
            if (policyNumberCount.getOrDefault(p.getPolicyNumber(), 0) > 1) {
                duplicates.add(p);
            }
        }
        return duplicates;
    }

    public void performanceComparison(Policy samplePolicy) {
        int iterations = 10000;
        List<Policy> policies = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            policies.add(new Policy("PN" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Auto", 1000 + i));
        }

        // HashSet
        long start = System.nanoTime();
        Set<Policy> hs = new HashSet<>();
        for (Policy p : policies) hs.add(p);
        long addTimeHS = System.nanoTime() - start;

        start = System.nanoTime();
        hs.contains(samplePolicy);
        long searchTimeHS = System.nanoTime() - start;

        start = System.nanoTime();
        hs.remove(samplePolicy);
        long removeTimeHS = System.nanoTime() - start;

        // LinkedHashSet
        start = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>();
        for (Policy p : policies) lhs.add(p);
        long addTimeLHS = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.contains(samplePolicy);
        long searchTimeLHS = System.nanoTime() - start;

        start = System.nanoTime();
        lhs.remove(samplePolicy);
        long removeTimeLHS = System.nanoTime() - start;

        // TreeSet
        start = System.nanoTime();
        Set<Policy> ts = new TreeSet<>();
        for (Policy p : policies) ts.add(p);
        long addTimeTS = System.nanoTime() - start;

        start = System.nanoTime();
        ts.contains(samplePolicy);
        long searchTimeTS = System.nanoTime() - start;

        start = System.nanoTime();
        ts.remove(samplePolicy);
        long removeTimeTS = System.nanoTime() - start;

        System.out.println("Performance Comparison (nanoseconds):");
        System.out.printf("HashSet:    Add=%d, Search=%d, Remove=%d%n", addTimeHS, searchTimeHS, removeTimeHS);
        System.out.printf("LinkedHashSet: Add=%d, Search=%d, Remove=%d%n", addTimeLHS, searchTimeLHS, removeTimeLHS);
        System.out.printf("TreeSet:    Add=%d, Search=%d, Remove=%d%n", addTimeTS, searchTimeTS, removeTimeTS);
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        manager.addPolicy(new Policy("P001", "Alice", LocalDate.parse("2024-07-10", dtf), "Health", 1200.0));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.parse("2024-07-05", dtf), "Auto", 900.0));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.parse("2024-08-01", dtf), "Home", 1500.0));
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.parse("2024-07-10", dtf), "Health", 1200.0)); // Duplicate

        System.out.println("All Unique Policies:");
        for (Policy p : manager.getAllUniquePolicies()) {
            System.out.println(p);
        }

        System.out.println("\nPolicies Expiring Soon (next 30 days):");
        for (Policy p : manager.getPoliciesExpiringSoon(30)) {
            System.out.println(p);
        }

        System.out.println("\nPolicies with Coverage Type 'Auto':");
        for (Policy p : manager.getPoliciesByCoverageType("Auto")) {
            System.out.println(p);
        }

        System.out.println("\nDuplicate Policies:");
        for (Policy p : manager.getDuplicatePolicies()) {
            System.out.println(p);
        }

        System.out.println("\nPerformance Comparison:");
        manager.performanceComparison(new Policy("P002", "Bob", LocalDate.parse("2024-07-05", dtf), "Auto", 900.0));
    }
}
