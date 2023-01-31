-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 31 Jan 2023 pada 06.40
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `appkasir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `id_supermarket` int(11) NOT NULL,
  `id_kasir` int(11) NOT NULL,
  `nama_barang` varchar(30) DEFAULT NULL,
  `stok` int(6) DEFAULT NULL,
  `harga_barang` int(10) DEFAULT NULL,
  `discount` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `id_supermarket`, `id_kasir`, `nama_barang`, `stok`, `harga_barang`, `discount`) VALUES
(1, 1, 1, 'sosis', 41, 2000, 0),
(3, 1, 1, 'air Mineral', 40, 13000, 0),
(6, 1, 1, 'davos', 95, 1000, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `id_kasir` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `id_supermarket` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `username`, `password`, `id_supermarket`) VALUES
(1, 'siti', '12345678', 1),
(2, 'andi', '87654321', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `supermarket`
--

CREATE TABLE `supermarket` (
  `id_supermarket` int(11) NOT NULL,
  `nama_supermarket` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `supermarket`
--

INSERT INTO `supermarket` (`id_supermarket`, `nama_supermarket`, `username`, `password`) VALUES
(1, 'zoomii', 'udin', '87654321'),
(2, 'kadoin', 'herman', '12345678');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_kasir` int(11) NOT NULL,
  `id_supermarket` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `quantity` int(8) DEFAULT NULL,
  `total` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_kasir`, `id_supermarket`, `tanggal`, `quantity`, `total`) VALUES
(1, 1, 1, '2023-01-29', 3, 39000),
(2, 1, 1, '2023-01-29', 4, 8000),
(3, 1, 1, '2023-01-29', 10, 130000),
(4, 1, 1, '2023-01-29', 10, 1000000),
(5, 1, 1, '2023-01-30', 10, 15000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `fk_barang` (`id_supermarket`),
  ADD KEY `id_kasir` (`id_kasir`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_kasir`),
  ADD KEY `fk_kasir` (`id_supermarket`);

--
-- Indeks untuk tabel `supermarket`
--
ALTER TABLE `supermarket`
  ADD PRIMARY KEY (`id_supermarket`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `fk_transaksi` (`id_kasir`),
  ADD KEY `id_supermarket` (`id_supermarket`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `kasir`
--
ALTER TABLE `kasir`
  MODIFY `id_kasir` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `supermarket`
--
ALTER TABLE `supermarket`
  MODIFY `id_supermarket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`id_kasir`) REFERENCES `kasir` (`id_kasir`),
  ADD CONSTRAINT `fk_barang` FOREIGN KEY (`id_supermarket`) REFERENCES `supermarket` (`id_supermarket`);

--
-- Ketidakleluasaan untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD CONSTRAINT `fk_kasir` FOREIGN KEY (`id_supermarket`) REFERENCES `supermarket` (`id_supermarket`);

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `fk_transaksi` FOREIGN KEY (`id_kasir`) REFERENCES `kasir` (`id_kasir`),
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_supermarket`) REFERENCES `supermarket` (`id_supermarket`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
